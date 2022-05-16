# UserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserItem**](UserApi.md#deleteUserItem) | **DELETE** /api/users/{id} | Removes the User resource.
[**getUserCollection**](UserApi.md#getUserCollection) | **GET** /api/users | Retrieves the collection of User resources.
[**getUserItem**](UserApi.md#getUserItem) | **GET** /api/users/{id} | Retrieves a User resource.
[**postUserCollection**](UserApi.md#postUserCollection) | **POST** /api/users | Creates a User resource.


<a name="deleteUserItem"></a>
# **deleteUserItem**
> deleteUserItem(id)

Removes the User resource.

Removes the User resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | Resource identifier
    try {
      apiInstance.deleteUserItem(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserItem");
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

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | User resource deleted |  -  |
**404** | Resource not found |  -  |

<a name="getUserCollection"></a>
# **getUserCollection**
> InlineResponse2001 getUserCollection(page, itemsPerPage, pagination)

Retrieves the collection of User resources.

Retrieves the collection of User resources.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    Integer itemsPerPage = 10; // Integer | The number of items per page
    Boolean pagination = true; // Boolean | Enable or disable pagination
    try {
      InlineResponse2001 result = apiInstance.getUserCollection(page, itemsPerPage, pagination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserCollection");
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
 **itemsPerPage** | **Integer**| The number of items per page | [optional] [default to 10]
 **pagination** | **Boolean**| Enable or disable pagination | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ld+json, application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User collection |  -  |

<a name="getUserItem"></a>
# **getUserItem**
> UserJsonldReadUserDetails getUserItem(id)

Retrieves a User resource.

Retrieves a User resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | Resource identifier
    try {
      UserJsonldReadUserDetails result = apiInstance.getUserItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserItem");
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

[**UserJsonldReadUserDetails**](UserJsonldReadUserDetails.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ld+json, application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource |  -  |
**404** | Resource not found |  -  |

<a name="postUserCollection"></a>
# **postUserCollection**
> UserJsonld postUserCollection(userJsonld)

Creates a User resource.

Creates a User resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    UserJsonld userJsonld = new UserJsonld(); // UserJsonld | The new User resource
    try {
      UserJsonld result = apiInstance.postUserCollection(userJsonld);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#postUserCollection");
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
 **userJsonld** | [**UserJsonld**](UserJsonld.md)| The new User resource |

### Return type

[**UserJsonld**](UserJsonld.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/ld+json, application/json, text/html
 - **Accept**: application/ld+json, application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | User resource created |  -  |
**400** | Invalid input |  -  |
**422** | Unprocessable entity |  -  |

