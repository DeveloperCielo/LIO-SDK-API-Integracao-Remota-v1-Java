# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.OrderManagementApi;

import java.io.File;
import java.util.*;

public class OrderManagementApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: merchant-id
        ApiKeyAuth merchant-id = (ApiKeyAuth) defaultClient.getAuthentication("merchant-id");
        merchant-id.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //merchant-id.setApiKeyPrefix("Token");

        // Configure API key authorization: access-token
        ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
        access-token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //access-token.setApiKeyPrefix("Token");

        // Configure API key authorization: client-id
        ApiKeyAuth client-id = (ApiKeyAuth) defaultClient.getAuthentication("client-id");
        client-id.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //client-id.setApiKeyPrefix("Token");

        OrderManagementApi apiInstance = new OrderManagementApi();
        String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
        String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
        String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
        String id = "id_example"; // String | Identificador do pedido.
        OrderItem body = new OrderItem(); // OrderItem | 
        try {
            Response result = apiInstance.orderAddItem(clientId, accessToken, merchantId, id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#orderAddItem");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cielo.com.br/sandbox-lio/order-management/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrderManagementApi* | [**orderAddItem**](docs/OrderManagementApi.md#orderAddItem) | **POST** /orders/{id}/items | 
*OrderManagementApi* | [**orderCreate**](docs/OrderManagementApi.md#orderCreate) | **POST** /orders | 
*OrderManagementApi* | [**orderDelete**](docs/OrderManagementApi.md#orderDelete) | **DELETE** /orders/{id} | 
*OrderManagementApi* | [**orderDeleteItem**](docs/OrderManagementApi.md#orderDeleteItem) | **DELETE** /orders/{id}/items/{itemId} | 
*OrderManagementApi* | [**orderGet**](docs/OrderManagementApi.md#orderGet) | **GET** /orders/{id} | 
*OrderManagementApi* | [**orderGetByParameters**](docs/OrderManagementApi.md#orderGetByParameters) | **GET** /orders | 
*OrderManagementApi* | [**orderGetItem**](docs/OrderManagementApi.md#orderGetItem) | **GET** /orders/{id}/items | 
*OrderManagementApi* | [**orderGetTransactions**](docs/OrderManagementApi.md#orderGetTransactions) | **GET** /orders/{id}/transactions | 
*OrderManagementApi* | [**orderUpdate**](docs/OrderManagementApi.md#orderUpdate) | **PUT** /orders/{id} | 
*OrderManagementApi* | [**orderUpdateItem**](docs/OrderManagementApi.md#orderUpdateItem) | **PUT** /orders/{id}/items/{itemId} | 


## Documentation for Models

 - [Card](docs/Card.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Order](docs/Order.md)
 - [OrderItem](docs/OrderItem.md)
 - [PaymentProduct](docs/PaymentProduct.md)
 - [Response](docs/Response.md)
 - [SubPaymentProduct](docs/SubPaymentProduct.md)
 - [Transaction](docs/Transaction.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### access-token

- **Type**: API key
- **API key parameter name**: access-token
- **Location**: HTTP header

### client-id

- **Type**: API key
- **API key parameter name**: client-id
- **Location**: HTTP header

### merchant-id

- **Type**: API key
- **API key parameter name**: merchant-id
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



