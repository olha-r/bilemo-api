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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ProductJsonldReadCollectionReadItems;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductApi {
    private ApiClient localVarApiClient;

    public ProductApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getProductCollection
     * @param page The collection page number (optional, default to 1)
     * @param itemsPerPage The number of items per page (optional, default to 5)
     * @param pagination Enable or disable pagination (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product collection </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProductCollectionCall(Integer page, Integer itemsPerPage, Boolean pagination, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/products";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (itemsPerPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("itemsPerPage", itemsPerPage));
        }

        if (pagination != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pagination", pagination));
        }

        final String[] localVarAccepts = {
            "application/ld+json", "application/json", "text/html"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProductCollectionValidateBeforeCall(Integer page, Integer itemsPerPage, Boolean pagination, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getProductCollectionCall(page, itemsPerPage, pagination, _callback);
        return localVarCall;

    }

    /**
     * Retrieves the collection of Product resources.
     * Retrieves the collection of Product resources.
     * @param page The collection page number (optional, default to 1)
     * @param itemsPerPage The number of items per page (optional, default to 5)
     * @param pagination Enable or disable pagination (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product collection </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 getProductCollection(Integer page, Integer itemsPerPage, Boolean pagination) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = getProductCollectionWithHttpInfo(page, itemsPerPage, pagination);
        return localVarResp.getData();
    }

    /**
     * Retrieves the collection of Product resources.
     * Retrieves the collection of Product resources.
     * @param page The collection page number (optional, default to 1)
     * @param itemsPerPage The number of items per page (optional, default to 5)
     * @param pagination Enable or disable pagination (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product collection </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> getProductCollectionWithHttpInfo(Integer page, Integer itemsPerPage, Boolean pagination) throws ApiException {
        okhttp3.Call localVarCall = getProductCollectionValidateBeforeCall(page, itemsPerPage, pagination, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves the collection of Product resources. (asynchronously)
     * Retrieves the collection of Product resources.
     * @param page The collection page number (optional, default to 1)
     * @param itemsPerPage The number of items per page (optional, default to 5)
     * @param pagination Enable or disable pagination (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product collection </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProductCollectionAsync(Integer page, Integer itemsPerPage, Boolean pagination, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductCollectionValidateBeforeCall(page, itemsPerPage, pagination, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProductItem
     * @param id Resource identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProductItemCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/products/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/ld+json", "application/json", "text/html"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProductItemValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProductItem(Async)");
        }
        

        okhttp3.Call localVarCall = getProductItemCall(id, _callback);
        return localVarCall;

    }

    /**
     * Retrieves a Product resource.
     * Retrieves a Product resource.
     * @param id Resource identifier (required)
     * @return ProductJsonldReadCollectionReadItems
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ProductJsonldReadCollectionReadItems getProductItem(String id) throws ApiException {
        ApiResponse<ProductJsonldReadCollectionReadItems> localVarResp = getProductItemWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieves a Product resource.
     * Retrieves a Product resource.
     * @param id Resource identifier (required)
     * @return ApiResponse&lt;ProductJsonldReadCollectionReadItems&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductJsonldReadCollectionReadItems> getProductItemWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getProductItemValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ProductJsonldReadCollectionReadItems>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves a Product resource. (asynchronously)
     * Retrieves a Product resource.
     * @param id Resource identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProductItemAsync(String id, final ApiCallback<ProductJsonldReadCollectionReadItems> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProductItemValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ProductJsonldReadCollectionReadItems>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
