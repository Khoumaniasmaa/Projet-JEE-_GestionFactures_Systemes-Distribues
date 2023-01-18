# Projet JEE et Systèmes Distribués : Gestion Les factures basée sur une architecture micro service
## Première partie du Projet :
###  Objectif :  

### Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.
### Travail à faire :

### 1.Créer le micro-service customer-service qui permet de gérer les client

![Screenshot_16](https://user-images.githubusercontent.com/84717947/205501414-7cd1d129-c61d-422a-832e-1139d49426f9.png)

### 2.Créer le micro-service inventory-service qui permet de gérer les produits

![Screenshot_17](https://user-images.githubusercontent.com/84717947/205501504-2e18b1a2-1379-421a-91b1-5f86835c17f2.png)

### 3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage

![image](https://user-images.githubusercontent.com/84717947/202049977-16eaff6a-4e6c-4bec-8aee-73f671d516b6.png)

![image](https://user-images.githubusercontent.com/84717947/202050107-dd795b5c-62c7-4894-81bc-06f2b4033252.png)

### 4. Créer l'annuaire Eureka Discrovery Service
![Screenshot_1](https://user-images.githubusercontent.com/84717947/205746816-97a17e53-b155-44cd-a88b-836b225313d4.png)

### 5. Faire une configuration dynamique des routes de la gateway

  ### 5-1 Customers 
  
![Screenshot_18](https://user-images.githubusercontent.com/84717947/205501617-a13cb18f-7a93-4676-9d09-6de0fdcd052a.png)

### 5-2 Produits

![Screenshot_19](https://user-images.githubusercontent.com/84717947/205501729-aa390489-c5d4-43ff-92c5-1e6af3dc53d3.png)

 ### 5-3 Afficher customers par ID

![image](https://user-images.githubusercontent.com/84717947/202050295-559e544e-4da1-405d-a020-1be5e1828338.png)

 ### 5-4 Produits par ID

![image](https://user-images.githubusercontent.com/84717947/202050329-3a574aea-cb06-40de-b0cc-874cd9bbcfe2.png)

### 6. Créer le service de facturation Billing-Service en utilisant Open Feign

### 6.1  Recuperation des facteurs par id 

![Screenshot_20](https://user-images.githubusercontent.com/84717947/205501806-a31fd1f6-7cca-4928-9a67-33544095898c.png)
 
### 6.2	Récupérer la factures avec le détails de produits : 
 
![image](https://user-images.githubusercontent.com/84717947/202050489-66d7b7f4-48db-4eca-b428-3c02f8e9b05f.png)

### 7. Créer un client Web Angular (Clients, Produits, Factures):

  ### 7.1-Listes des produits:

![Screenshot_1](https://user-images.githubusercontent.com/84717947/202864336-d3ed6e4c-b3f6-4e9a-8ee7-2ab5935bcc75.png)
     
  ### 7.2- Listes des customers:

![Screenshot_2](https://user-images.githubusercontent.com/84717947/202864337-711f42f7-7dc0-4d90-948f-cd5d09b7404f.png)

   ### 7.3-Les factures de chaque customer:

![Screenshot_3](https://user-images.githubusercontent.com/84717947/202864351-70f83694-6e47-41b0-90f5-5588603b58d4.png)

### 8. Déployer le serveur keycloak :

     - Créer un Realm!
     
   ![Screenshot_3](https://user-images.githubusercontent.com/84717947/205497306-958af207-a2a5-43ba-b6be-c97538ccb1cf.png)
     
     - Créer un client à sécuriser
     
   ![Screenshot_4](https://user-images.githubusercontent.com/84717947/205497357-b130538b-d6d6-4a6f-b795-e668e9cb6ac8.png)

      - Créer des utilisateurs
     
   ![Screenshot_5](https://user-images.githubusercontent.com/84717947/205498112-f44ada28-f89c-49ba-b8fc-5619acc63b35.png)    

     - Créer des rôles
     
   ![Screenshot_6](https://user-images.githubusercontent.com/84717947/205498207-5e4517dd-c814-4428-b129-6231425fb372.png)

     - Affecter les rôles aux utilisateurs
     
   ![Screenshot_7](https://user-images.githubusercontent.com/84717947/205498321-f904a52e-9241-4e88-885a-f80bf3428dc6.png)

   ![Screenshot_8](https://user-images.githubusercontent.com/84717947/205498300-5e44a0a6-66ae-45e2-be83-9d0aac8ab3cd.png)

   ![Screenshot_9](https://user-images.githubusercontent.com/84717947/205498271-0836875d-db47-4108-87a2-a9467dfbb8fc.png)

     - Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token :
     
   ![Screenshot_23](https://user-images.githubusercontent.com/84717947/205503622-416cab15-3de4-4673-8709-0e2335825a14.png)

   ![Screenshot_24](https://user-images.githubusercontent.com/84717947/205503633-2f882f14-1dc0-483d-8fd2-a07e75a910f6.png)

   ![Screenshot_25](https://user-images.githubusercontent.com/84717947/205503635-db3ed629-80ac-4bf5-acd2-469bbbabdf0a.png)

    ![Screenshot_26](https://user-images.githubusercontent.com/84717947/205503643-eb37ba72-52a6-4dae-8a18-a6874036dbe2.png)

### 9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak

### 9.1: Connecter a un user 

![Screenshot_10](https://user-images.githubusercontent.com/84717947/205498625-51779557-a9d6-4039-a58c-563654cf5cb9.png)

### 9.2 Product 

![Screenshot_11](https://user-images.githubusercontent.com/84717947/205498655-a4030cfa-a393-4123-82f4-7aff98298f87.png)

### 9.3: Customer 

![Screenshot_12](https://user-images.githubusercontent.com/84717947/205498688-5705e74d-c9d4-4b5e-8511-7b9474a96b05.png)

### 9.4 :facture:

![Screenshot_13](https://user-images.githubusercontent.com/84717947/205498702-ff2d7dcb-86bd-4d1d-9b74-66b7bee43907.png)

### 9.5-logout:

![Screenshot_15](https://user-images.githubusercontent.com/84717947/205498738-aa128020-e82e-40b2-9033-335a89010f6e.png)

## Dernière partie :
### 1. Intégration du Bocker KAFKA
### 2. Création d'un micro-service qui permet de produire aléatoirement des factures et de les publier dans un Topic KAFKA

![2](https://user-images.githubusercontent.com/84717947/213063242-23c423e1-7ee4-4783-99a9-24167cd4ada2.png)

### 3. Permettre au Micro-service déjà développé BILLING-SERVICE de consommer les factures publier dans le Topic KAFKA et de les enregistrer dans sa base de données

![3](https://user-images.githubusercontent.com/84717947/213063614-775260a1-0966-40ef-b45a-454af4c4a72a.png)

### 4. Créer un micro-service Data-Analytics-Service qui utilise l'API KAFKA Streams pour effectuer du Real Time Stream Processing en consommant le streams de facture publiées dans le Topic KAFKA

![4](https://user-images.githubusercontent.com/84717947/213063869-b1030aa9-f9c3-4b21-8b4c-1fa591bb3858.png)

### 5. Créer une Page Frontend qui permet de présenter en temps réel les courbes qui montrent les résultats produits par le service du Data Analytics

![Screenshot_2](https://user-images.githubusercontent.com/84717947/213064040-c9cf7965-0a6f-4c2a-951c-4a1fc37d5572.png)



