/*
 * LIO - Order Management API
 * API de gerenciamento de pedidos da LIO.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.Order;
import io.swagger.client.model.OrderItem;
import io.swagger.client.model.Response;
import io.swagger.client.model.Transaction;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderManagementApi
 */
@Ignore
public class OrderManagementApiTest {

    private final OrderManagementApi api = new OrderManagementApi();

    
    /**
     * 
     *
     * Recurso responsável por efetuar a inclusão de um novo item em um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderAddItemTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        OrderItem body = null;
        Response response = api.orderAddItem(clientId, accessToken, merchantId, id, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a criação de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderCreateTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        Order body = null;
        Response response = api.orderCreate(clientId, accessToken, merchantId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a exclusão de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderDeleteTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        api.orderDelete(clientId, accessToken, merchantId, id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a exclusão de um item de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderDeleteItemTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        String itemId = null;
        Response response = api.orderDeleteItem(clientId, accessToken, merchantId, id, itemId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a consulta de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        Order response = api.orderGet(clientId, accessToken, merchantId, id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a consulta de pedidos, com a possibilidade de aplicar filtros.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderGetByParametersTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String parameters = null;
        api.orderGetByParameters(clientId, accessToken, merchantId, parameters);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a consulta de um item em um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderGetItemTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        OrderItem response = api.orderGetItem(clientId, accessToken, merchantId, id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a consulta das transações de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderGetTransactionsTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        Transaction response = api.orderGetTransactions(clientId, accessToken, merchantId, id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar o cancelamento de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderUpdateTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        String operation = null;
        api.orderUpdate(clientId, accessToken, merchantId, id, operation);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Recurso responsável por efetuar a alteração de um item de um pedido.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderUpdateItemTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String merchantId = null;
        String id = null;
        String itemId = null;
        OrderItem body = null;
        Response response = api.orderUpdateItem(clientId, accessToken, merchantId, id, itemId, body);

        // TODO: test validations
    }
    
}
