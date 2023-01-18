package org.sid.gitway;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GitwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitwayApplication.class, args);
	}

/* Configuration format java */
	/***Configuration static ****/
//	@Bean
	/* RouteLocator :pour configurer les rout */
	/*le buildre on va l'utiliser pour configurer les rout */
	RouteLocator routeLocator(RouteLocatorBuilder builder){
		return builder.routes()
				.route((r)->r.path("/customers/**").uri("lb:/CUSTOMER-SERVICE"))
				.route((r)->r.path("/products/**").uri("lb:/PRODUCT-SERVICE"))
				.build();

	}
	/***Configuration dynamique ****/
	/*Ici je dit  qque je sias pas les microservces mais une fois que
	tu recoit une requette  regarde dan url de requette tu va trouver le nom de microservices*/
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator(
			ReactiveDiscoveryClient rdc,
			DiscoveryLocatorProperties properties){
		return  new DiscoveryClientRouteDefinitionLocator(rdc,properties);
	}
}
