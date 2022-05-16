/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ProductJsonldReadCollectionReadItems;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductApi
 */
@Ignore
public class ProductApiTest {

    private final ProductApi api = new ProductApi();

    
    /**
     * Retrieves the collection of Product resources.
     *
     * Retrieves the collection of Product resources.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductCollectionTest() throws ApiException {
        Integer page = null;
        Integer itemsPerPage = null;
        Boolean pagination = null;
        InlineResponse200 response = api.getProductCollection(page, itemsPerPage, pagination);

        // TODO: test validations
    }
    
    /**
     * Retrieves a Product resource.
     *
     * Retrieves a Product resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductItemTest() throws ApiException {
        String id = null;
        ProductJsonldReadCollectionReadItems response = api.getProductItem(id);

        // TODO: test validations
    }
    
}
