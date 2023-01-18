package org.sid.billingservice.services;

import lombok.AllArgsConstructor;
import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.entities.ProductItem;
import org.sid.billingservice.feign.CustomerRestClient;
import org.sid.billingservice.feign.ProductItemRestClient;
import org.sid.billingservice.model.Customer;
import org.sid.billingservice.model.Product;
import org.sid.billingservice.repository.BillRepository;
import org.sid.billingservice.repository.ProductItemRepsitory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

@Service
@AllArgsConstructor
public class BillsEventService {
    private BillRepository billRepository;
    private ProductItemRepsitory productItemRepsitory;
    private CustomerRestClient customerRestClient;
    private ProductItemRestClient productItemRestClient;
    @Bean
    public Consumer<Bill> BillsEventConsumer()
    {

        return (input) -> {

            List<Product> products = productItemRestClient.pageProducts().getContent().stream().toList();
            Random random = new Random();
            Bill bill = input;
            Customer customer = customerRestClient.getCustomerById(input.getCustomerID());
            bill.setCustomer(customer);
            Bill savedBill = billRepository.save(bill);
            for (int j = 0; j < products.size(); j++)
            {
                if (Math.random() > 0.60)
                {
                    ProductItem productItem = ProductItem.builder()
                            .bill(savedBill)
                            .productID(products.get(j).getId())
                            .price(products.get(j).getPrice())
                            .quantity(random.nextInt(5) + 1)
                            .product(products.get(j))
                            .build();
                    productItemRepsitory.save(productItem);
                }
            }

            System.out.println(customer.toString());

        };
    }

}
