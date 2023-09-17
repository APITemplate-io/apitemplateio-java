# PdfManipulationApiApi

All URIs are relative to *https://rest.apitemplate.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mergePdfs**](PdfManipulationApiApi.md#mergePdfs) | **POST** /v2/merge-pdfs | Join/Merge multiple PDFs |


<a id="mergePdfs"></a>
# **mergePdfs**
> ResponseSuccessSingleFile mergePdfs(mergePdfsRequest, postactionS3Filekey, postactionS3Bucket, meta)

Join/Merge multiple PDFs

This endpoint merges/joins multiple PDF URLs into a single PDF file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfManipulationApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PdfManipulationApiApi apiInstance = new PdfManipulationApiApi(defaultClient);
    MergePdfsRequest mergePdfsRequest = new MergePdfsRequest(); // MergePdfsRequest | 
    String postactionS3Filekey = "postactionS3Filekey_example"; // String | - This is to specify the file name for `Post Action(S3 Storage)`. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter 
    String postactionS3Bucket = "postactionS3Bucket_example"; // String | - This is to overwrite the AWS Bucket for `Post Action(S3 Storage)`. 
    String meta = "inv-iwj343jospig"; // String | - Specify an external reference ID for your own reference. It appears in the `list-objects` API. 
    try {
      ResponseSuccessSingleFile result = apiInstance.mergePdfs(mergePdfsRequest, postactionS3Filekey, postactionS3Bucket, meta);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfManipulationApiApi#mergePdfs");
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
| **mergePdfsRequest** | [**MergePdfsRequest**](MergePdfsRequest.md)|  | |
| **postactionS3Filekey** | **String**| - This is to specify the file name for &#x60;Post Action(S3 Storage)&#x60;. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter  | [optional] |
| **postactionS3Bucket** | **String**| - This is to overwrite the AWS Bucket for &#x60;Post Action(S3 Storage)&#x60;.  | [optional] |
| **meta** | **String**| - Specify an external reference ID for your own reference. It appears in the &#x60;list-objects&#x60; API.  | [optional] |

### Return type

[**ResponseSuccessSingleFile**](ResponseSuccessSingleFile.md)

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

