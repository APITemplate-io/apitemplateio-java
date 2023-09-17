# TemplateManagementApi

All URIs are relative to *https://rest.apitemplate.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTemplate**](TemplateManagementApi.md#getTemplate) | **GET** /v2/get-template | Get PDF template |
| [**listTemplates**](TemplateManagementApi.md#listTemplates) | **GET** /v2/list-templates | List Templates |
| [**updateTemplate**](TemplateManagementApi.md#updateTemplate) | **POST** /v2/update-template | Update PDF Template |


<a id="getTemplate"></a>
# **getTemplate**
> ResponseSuccessTemplate getTemplate(templateId)

Get PDF template

Retrieves information of the PDF template (**This is an experimental API, contact support to learn more**) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplateManagementApi apiInstance = new TemplateManagementApi(defaultClient);
    String templateId = "00377b2b1e0ee394"; // String | Your template id, it can be obtained in the web console(Manage Templates)
    try {
      ResponseSuccessTemplate result = apiInstance.getTemplate(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateManagementApi#getTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateId** | **String**| Your template id, it can be obtained in the web console(Manage Templates) | [optional] |

### Return type

[**ResponseSuccessTemplate**](ResponseSuccessTemplate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns status and template information |  -  |
| **0** | unexpected error |  -  |

<a id="listTemplates"></a>
# **listTemplates**
> ResponseSuccessListTemplates listTemplates(limit, offset, format, templateId, groupName, withLayerInfo)

List Templates

Retrieves the information of templates 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplateManagementApi apiInstance = new TemplateManagementApi(defaultClient);
    String limit = "300"; // String | Retrieve only the number of records specified. Default to 300
    String offset = "0"; // String | Offset is used to skip the number of records from the results. Default to 0
    String format = "JPEG"; // String | To filter the templates by either 'PDF' or 'JPEG'
    String templateId = "00377b2b1e0ee394"; // String | To filter the templates by template id
    String groupName = "custom"; // String | To filter the templates by the group name
    String withLayerInfo = "0"; // String | Return along with layer information for image templates, 0=false , 1=true. Default to '0'
    try {
      ResponseSuccessListTemplates result = apiInstance.listTemplates(limit, offset, format, templateId, groupName, withLayerInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateManagementApi#listTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **String**| Retrieve only the number of records specified. Default to 300 | [optional] |
| **offset** | **String**| Offset is used to skip the number of records from the results. Default to 0 | [optional] |
| **format** | **String**| To filter the templates by either &#39;PDF&#39; or &#39;JPEG&#39; | [optional] |
| **templateId** | **String**| To filter the templates by template id | [optional] |
| **groupName** | **String**| To filter the templates by the group name | [optional] |
| **withLayerInfo** | **String**| Return along with layer information for image templates, 0&#x3D;false , 1&#x3D;true. Default to &#39;0&#39; | [optional] |

### Return type

[**ResponseSuccessListTemplates**](ResponseSuccessListTemplates.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns status and output file |  -  |
| **0** | unexpected error |  -  |

<a id="updateTemplate"></a>
# **updateTemplate**
> ResponseSuccess updateTemplate(updateTemplateRequest)

Update PDF Template

This endpoint updates PDF template (**This is an experimental API, contact support to learn more**)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplateManagementApi apiInstance = new TemplateManagementApi(defaultClient);
    UpdateTemplateRequest updateTemplateRequest = new UpdateTemplateRequest(); // UpdateTemplateRequest | 
    try {
      ResponseSuccess result = apiInstance.updateTemplate(updateTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateManagementApi#updateTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateTemplateRequest** | [**UpdateTemplateRequest**](UpdateTemplateRequest.md)|  | |

### Return type

[**ResponseSuccess**](ResponseSuccess.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns status and output file |  -  |
| **0** | unexpected error |  -  |

