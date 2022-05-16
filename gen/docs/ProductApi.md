# ProductApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductCollection**](ProductApi.md#getProductCollection) | **GET** /api/products | Retrieves the collection of Product resources.
[**getProductItem**](ProductApi.md#getProductItem) | **GET** /api/products/{id} | Retrieves a Product resource.


<a name="getProductCollection"></a>
# **getProductCollection**
> InlineResponse200 getProductCollection(page, itemsPerPage, pagination)

Retrieves the collection of Product resources.

Retrieves the collection of Product resources.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    Integer itemsPerPage = 5; // Integer | The number of items per page
    Boolean pagination = true; // Boolean | Enable or disable pagination
    try {
      InlineResponse200 result = apiInstance.getProductCollection(page, itemsPerPage, pagination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The collection page number | [optional] [default to 1]
 **itemsPerPage** | **Integer**| The number of items per page | [optional] [default to 5]
 **pagination** | **Boolean**| Enable or disable pagination | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ld+json, application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Product collection |  -  |

<a name="getProductItem"></a>
# **getProductItem**
> ProductJsonldReadCollectionReadItems getProductItem(id)

Retrieves a Product resource.

Retrieves a Product resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    String id = "id_example"; // String | Resource identifier
    try {
      ProductJsonldReadCollectionReadItems result = apiInstance.getProductItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Resource identifier |

### Return type

[**ProductJsonldReadCollectionReadItems**](ProductJsonldReadCollectionReadItems.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ld+json, application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Product resource |  -  |
**404** | Resource not found |  -  |

