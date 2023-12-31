# ApiIntegrationApi

All URIs are relative to *https://rest.apitemplate.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createImage**](ApiIntegrationApi.md#createImage) | **POST** /v2/create-image | Create an Image |
| [**createPdf**](ApiIntegrationApi.md#createPdf) | **POST** /v2/create-pdf | Create a PDF |
| [**createPdfFromHtml**](ApiIntegrationApi.md#createPdfFromHtml) | **POST** /v2/create-pdf-from-html | Create a PDF from HTML |
| [**createPdfFromUrl**](ApiIntegrationApi.md#createPdfFromUrl) | **POST** /v2/create-pdf-from-url | Create a PDF from URL |
| [**deleteObject**](ApiIntegrationApi.md#deleteObject) | **GET** /v2/delete-object | Delete an Object |
| [**listObjects**](ApiIntegrationApi.md#listObjects) | **GET** /v2/list-objects | List Generated Objects |


<a id="createImage"></a>
# **createImage**
> ResponseSuccessImageFile createImage(templateId, body, outputImageType, expiration, cloudStorage, postactionS3Filekey, postactionS3Bucket, meta)

Create an Image

This endpoint creates a JPEG file(along with PNG) with JSON data and your template 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ApiIntegrationApi apiInstance = new ApiIntegrationApi(defaultClient);
    String templateId = "00377b2b1e0ee394"; // String | Your template id, it can be obtained in the web console
    Object body = null; // Object | 
    String outputImageType = "1"; // String | - Output image type(JPEG or PNG format), default to `all`. Options are `all`, `jpegOnly`,`pngOnly`. 
    Integer expiration = 5; // Integer | - Expiration of the generated PDF in minutes(default to `0`, store permanently)   - Use `0` to store on cdn permanently   - Or use the range between `1` minute and `10080` minutes(7 days) to specify the expiration of the generated PDF 
    Integer cloudStorage = 1; // Integer | - Upload the generated PDFs/images to our storage CDN, default to `1`. If you have configured `Post Action` to upload the PDFs/Images to your own S3, please set it to `0`. 
    String postactionS3Filekey = "postactionS3Filekey_example"; // String | - This is to specify the file name for `Post Action(S3 Storage)`. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter 
    String postactionS3Bucket = "postactionS3Bucket_example"; // String | - This is to overwrite the AWS Bucket for `Post Action(S3 Storage)`. 
    String meta = "inv-iwj343jospig"; // String | - Specify an external reference ID for your own reference. It appears in the `list-objects` API. 
    try {
      ResponseSuccessImageFile result = apiInstance.createImage(templateId, body, outputImageType, expiration, cloudStorage, postactionS3Filekey, postactionS3Bucket, meta);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiIntegrationApi#createImage");
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
| **templateId** | **String**| Your template id, it can be obtained in the web console | |
| **body** | **Object**|  | |
| **outputImageType** | **String**| - Output image type(JPEG or PNG format), default to &#x60;all&#x60;. Options are &#x60;all&#x60;, &#x60;jpegOnly&#x60;,&#x60;pngOnly&#x60;.  | [optional] |
| **expiration** | **Integer**| - Expiration of the generated PDF in minutes(default to &#x60;0&#x60;, store permanently)   - Use &#x60;0&#x60; to store on cdn permanently   - Or use the range between &#x60;1&#x60; minute and &#x60;10080&#x60; minutes(7 days) to specify the expiration of the generated PDF  | [optional] |
| **cloudStorage** | **Integer**| - Upload the generated PDFs/images to our storage CDN, default to &#x60;1&#x60;. If you have configured &#x60;Post Action&#x60; to upload the PDFs/Images to your own S3, please set it to &#x60;0&#x60;.  | [optional] |
| **postactionS3Filekey** | **String**| - This is to specify the file name for &#x60;Post Action(S3 Storage)&#x60;. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter  | [optional] |
| **postactionS3Bucket** | **String**| - This is to overwrite the AWS Bucket for &#x60;Post Action(S3 Storage)&#x60;.  | [optional] |
| **meta** | **String**| - Specify an external reference ID for your own reference. It appears in the &#x60;list-objects&#x60; API.  | [optional] |

### Return type

[**ResponseSuccessImageFile**](ResponseSuccessImageFile.md)

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

<a id="createPdf"></a>
# **createPdf**
> ResponseSuccessPDFFile createPdf(templateId, body, exportType, expiration, outputHtml, outputFormat, filename, imageResampleRes, isCmyk, cloudStorage, pdfStandard, postactionS3Filekey, postactionS3Bucket, meta, async, webhookUrl)

Create a PDF

This endpoint creates a PDF file with JSON data and your template. We support synchoronus and asynchronous PDF generation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ApiIntegrationApi apiInstance = new ApiIntegrationApi(defaultClient);
    String templateId = "00377b2b1e0ee394"; // String | Your template id, it can be obtained in the web console
    Object body = null; // Object | 
    String exportType = "json"; // String | - Either `file` or `json`(Default).   - The option `json` returns a JSON object, and the output PDF is stored on a CDN. Use this with the parameter `expiration`   - The option `file` returns binary data of the generated PDF(Secure and completely private) and the response HTTP header Content-Disposition is set to attachment. 
    Integer expiration = 5; // Integer | - Expiration of the generated PDF in minutes(default to `0`, store permanently)   - Use `0` to store on cdn permanently   - Or use the range between `1` minute and `10080` minutes(7 days) to specify the expiration of the generated PDF 
    String outputHtml = "0"; // String | - Either `1` or `0`(Default). - To enable output of html content, set the value to `1` and it will return in the JSON response as html_url field (as a URL) 
    String outputFormat = "pdf"; // String | - Either `pdf`(Default) or `html`. - It's generating PDF by default. However, you can specify output_format=html to generate only HTML(It will return in the JSON response as download_url field as a URL). 
    String filename = "invoice_89326.pdf"; // String | - Default to UUID (e.g 0c93bd9e-9ebb-4634-a70f-de9131848416.pdf). Use this to specify custom file name, it should end with `.pdf` 
    String imageResampleRes = "150"; // String | - We embed the original images by default, meaning large PDF file sizes. Specifying the option 'image_resample_res' helps reduce the PDF file size by downsampling the images of the current PDF to a resolution(in DPI). Common values are 72, 96, 150, 300 and 600. 
    String isCmyk = "0"; // String | - Use CMYK color profile, 1=true, 0=false. Default to '0' 
    Integer cloudStorage = 1; // Integer | - Upload the generated PDFs/images to our storage CDN, default to `1`. If you have configured `Post Action` to upload the PDFs/Images to your own S3, please set it to `0`. 
    String pdfStandard = "pdfStandard_example"; // String | Default to PDF1.4. Options are PDFA1B, PDFA2 and PDFA3 (This is an experimental feature) 
    String postactionS3Filekey = "postactionS3Filekey_example"; // String | - This is to specify the file name for `Post Action(S3 Storage)`. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter 
    String postactionS3Bucket = "postactionS3Bucket_example"; // String | - This is to overwrite the AWS Bucket for `Post Action(S3 Storage)`. 
    String meta = "inv-iwj343jospig"; // String | - Specify an external reference ID for your own reference. It appears in the `list-objects` API. 
    String async = "0"; // String | - Either `1` or `0`(Default).  `0` is synchronous call(default), `1` is asynchronous call - To generate PDF asynchronously, set the value to `1` and the API call returns immediately. Once the PDF document is generated, we will make a HTTP/HTTPS GET to your URL(webhook_url) and will retry for 3 times before giving up. - If `async` is set to `1`, then `webhook_url` is mandatory 
    String webhookUrl = "https://yourwebserver.com"; // String | - It is the URL of your webhook URL, it starts with http:// or https:// and has to be urlencoded. - If `async` is set to `1`, then you have to specify the `webhook_url`.   #### Format of Webhook callback  Once the PDF is generated, we will initiate a HTTP/HTTPS GET call to the following URL:  https://`[yourwebserver.com]`?&primary_url=`[primary_url]`&transaction_ref=`[transaction_ref]`&status=`[status]`&message=`[message]`  - `[yourwebserver.com]`: The web services to handle the callback, which is the `webhook_url` - `[primary_url]`: The URL to the PDF document - `[transaction_ref]`: The transaction reference number - `[status]` : Status of the transaction, either `success` or `error` - `[message]` : Status message  ***The following is a sample webhook call back to your server***  https://yourwebserver.com?&primary_url=https%3A%2F%2Fpub-cdn.apitemplate.io%2F2021%2F06%2Fb692183d-46d7-3213-891a-460a5814ad3f.pdf&transaction_ref=b692183d-46d7-3213-891a-460a5814ad3f&status=success 
    try {
      ResponseSuccessPDFFile result = apiInstance.createPdf(templateId, body, exportType, expiration, outputHtml, outputFormat, filename, imageResampleRes, isCmyk, cloudStorage, pdfStandard, postactionS3Filekey, postactionS3Bucket, meta, async, webhookUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiIntegrationApi#createPdf");
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
| **templateId** | **String**| Your template id, it can be obtained in the web console | |
| **body** | **Object**|  | |
| **exportType** | **String**| - Either &#x60;file&#x60; or &#x60;json&#x60;(Default).   - The option &#x60;json&#x60; returns a JSON object, and the output PDF is stored on a CDN. Use this with the parameter &#x60;expiration&#x60;   - The option &#x60;file&#x60; returns binary data of the generated PDF(Secure and completely private) and the response HTTP header Content-Disposition is set to attachment.  | [optional] |
| **expiration** | **Integer**| - Expiration of the generated PDF in minutes(default to &#x60;0&#x60;, store permanently)   - Use &#x60;0&#x60; to store on cdn permanently   - Or use the range between &#x60;1&#x60; minute and &#x60;10080&#x60; minutes(7 days) to specify the expiration of the generated PDF  | [optional] |
| **outputHtml** | **String**| - Either &#x60;1&#x60; or &#x60;0&#x60;(Default). - To enable output of html content, set the value to &#x60;1&#x60; and it will return in the JSON response as html_url field (as a URL)  | [optional] |
| **outputFormat** | **String**| - Either &#x60;pdf&#x60;(Default) or &#x60;html&#x60;. - It&#39;s generating PDF by default. However, you can specify output_format&#x3D;html to generate only HTML(It will return in the JSON response as download_url field as a URL).  | [optional] |
| **filename** | **String**| - Default to UUID (e.g 0c93bd9e-9ebb-4634-a70f-de9131848416.pdf). Use this to specify custom file name, it should end with &#x60;.pdf&#x60;  | [optional] |
| **imageResampleRes** | **String**| - We embed the original images by default, meaning large PDF file sizes. Specifying the option &#39;image_resample_res&#39; helps reduce the PDF file size by downsampling the images of the current PDF to a resolution(in DPI). Common values are 72, 96, 150, 300 and 600.  | [optional] |
| **isCmyk** | **String**| - Use CMYK color profile, 1&#x3D;true, 0&#x3D;false. Default to &#39;0&#39;  | [optional] |
| **cloudStorage** | **Integer**| - Upload the generated PDFs/images to our storage CDN, default to &#x60;1&#x60;. If you have configured &#x60;Post Action&#x60; to upload the PDFs/Images to your own S3, please set it to &#x60;0&#x60;.  | [optional] |
| **pdfStandard** | **String**| Default to PDF1.4. Options are PDFA1B, PDFA2 and PDFA3 (This is an experimental feature)  | [optional] |
| **postactionS3Filekey** | **String**| - This is to specify the file name for &#x60;Post Action(S3 Storage)&#x60;. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter  | [optional] |
| **postactionS3Bucket** | **String**| - This is to overwrite the AWS Bucket for &#x60;Post Action(S3 Storage)&#x60;.  | [optional] |
| **meta** | **String**| - Specify an external reference ID for your own reference. It appears in the &#x60;list-objects&#x60; API.  | [optional] |
| **async** | **String**| - Either &#x60;1&#x60; or &#x60;0&#x60;(Default).  &#x60;0&#x60; is synchronous call(default), &#x60;1&#x60; is asynchronous call - To generate PDF asynchronously, set the value to &#x60;1&#x60; and the API call returns immediately. Once the PDF document is generated, we will make a HTTP/HTTPS GET to your URL(webhook_url) and will retry for 3 times before giving up. - If &#x60;async&#x60; is set to &#x60;1&#x60;, then &#x60;webhook_url&#x60; is mandatory  | [optional] |
| **webhookUrl** | **String**| - It is the URL of your webhook URL, it starts with http:// or https:// and has to be urlencoded. - If &#x60;async&#x60; is set to &#x60;1&#x60;, then you have to specify the &#x60;webhook_url&#x60;.   #### Format of Webhook callback  Once the PDF is generated, we will initiate a HTTP/HTTPS GET call to the following URL:  https://&#x60;[yourwebserver.com]&#x60;?&amp;primary_url&#x3D;&#x60;[primary_url]&#x60;&amp;transaction_ref&#x3D;&#x60;[transaction_ref]&#x60;&amp;status&#x3D;&#x60;[status]&#x60;&amp;message&#x3D;&#x60;[message]&#x60;  - &#x60;[yourwebserver.com]&#x60;: The web services to handle the callback, which is the &#x60;webhook_url&#x60; - &#x60;[primary_url]&#x60;: The URL to the PDF document - &#x60;[transaction_ref]&#x60;: The transaction reference number - &#x60;[status]&#x60; : Status of the transaction, either &#x60;success&#x60; or &#x60;error&#x60; - &#x60;[message]&#x60; : Status message  ***The following is a sample webhook call back to your server***  https://yourwebserver.com?&amp;primary_url&#x3D;https%3A%2F%2Fpub-cdn.apitemplate.io%2F2021%2F06%2Fb692183d-46d7-3213-891a-460a5814ad3f.pdf&amp;transaction_ref&#x3D;b692183d-46d7-3213-891a-460a5814ad3f&amp;status&#x3D;success  | [optional] |

### Return type

[**ResponseSuccessPDFFile**](ResponseSuccessPDFFile.md)

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

<a id="createPdfFromHtml"></a>
# **createPdfFromHtml**
> ResponseSuccessPDFFile createPdfFromHtml(createPdfFromHtmlRequest, exportType, expiration, outputFormat, filename, imageResampleRes, isCmyk, cloudStorage, pdfStandard, postactionS3Filekey, postactionS3Bucket, meta, async, webhookUrl)

Create a PDF from HTML

- This endpoint creates a PDF file from HTML with JSON data 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ApiIntegrationApi apiInstance = new ApiIntegrationApi(defaultClient);
    CreatePdfFromHtmlRequest createPdfFromHtmlRequest = new CreatePdfFromHtmlRequest(); // CreatePdfFromHtmlRequest | 
    String exportType = "json"; // String | - Either `file` or `json`(Default).   - The option `json` returns a JSON object, and the output PDF is stored on a CDN. Use this with the parameter `expiration`   - The option `file` returns binary data of the generated PDF(Secure and completely private) and the response HTTP header Content-Disposition is set to attachment. 
    Integer expiration = 5; // Integer | - Expiration of the generated PDF in minutes(default to `0`, store permanently)   - Use `0` to store on cdn permanently   - Or use the range between `1` minute and `10080` minutes(7 days) to specify the expiration of the generated PDF 
    String outputFormat = "pdf"; // String | - Either `pdf`(Default) or `html`. - It's generating PDF by default. However, you can specify output_format=html to generate only HTML(It will return in the JSON response as download_url field as a URL). 
    String filename = "invoice_89326.pdf"; // String | - Default to UUID (e.g 0c93bd9e-9ebb-4634-a70f-de9131848416.pdf). Use this to specify custom file name, it should end with `.pdf` 
    String imageResampleRes = "150"; // String | - We embed the original images by default, meaning large PDF file sizes. Specifying the option 'image_resample_res' helps reduce the PDF file size by downsampling the images of the current PDF to a resolution(in DPI). Common values are 72, 96, 150, 300 and 600. 
    String isCmyk = "0"; // String | - Use CMYK color profile, 1=true, 0=false. Default to '0' 
    Integer cloudStorage = 1; // Integer | - Upload the generated PDFs/images to our storage CDN, default to `1`. If you have configured `Post Action` to upload the PDFs/Images to your own S3, please set it to `0`. 
    String pdfStandard = "pdfStandard_example"; // String | Default to PDF1.4. Options are PDFA1B, PDFA2 and PDFA3 (This is an experimental feature) 
    String postactionS3Filekey = "postactionS3Filekey_example"; // String | - This is to specify the file name for `Post Action(S3 Storage)`. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter 
    String postactionS3Bucket = "postactionS3Bucket_example"; // String | - This is to overwrite the AWS Bucket for `Post Action(S3 Storage)`. 
    String meta = "inv-iwj343jospig"; // String | - Specify an external reference ID for your own reference. It appears in the `list-objects` API. 
    String async = "0"; // String | - Either `1` or `0`(Default).  `0` is synchronous call(default), `1` is asynchronous call - To generate PDF asynchronously, set the value to `1` and the API call returns immediately. Once the PDF document is generated, we will make a HTTP/HTTPS GET to your URL(webhook_url) and will retry for 3 times before giving up. - If `async` is set to `1`, then `webhook_url` is mandatory 
    String webhookUrl = "https://yourwebserver.com"; // String | - It is the URL of your webhook URL, it starts with http:// or https:// and has to be urlencoded. - If `async` is set to `1`, then you have to specify the `webhook_url`.   #### Format of Webhook callback  Once the PDF is generated, we will initiate a HTTP/HTTPS GET call to the following URL:  https://`[yourwebserver.com]`?&primary_url=`[primary_url]`&transaction_ref=`[transaction_ref]`&status=`[status]`&message=`[message]`  - `[yourwebserver.com]`: The web services to handle the callback, which is the `webhook_url` - `[primary_url]`: The URL to the PDF document - `[transaction_ref]`: The transaction reference number - `[status]` : Status of the transaction, either `success` or `error` - `[message]` : Status message  ***The following is a sample webhook call back to your server***  https://yourwebserver.com?&primary_url=https%3A%2F%2Fpub-cdn.apitemplate.io%2F2021%2F06%2Fb692183d-46d7-3213-891a-460a5814ad3f.pdf&transaction_ref=b692183d-46d7-3213-891a-460a5814ad3f&status=success 
    try {
      ResponseSuccessPDFFile result = apiInstance.createPdfFromHtml(createPdfFromHtmlRequest, exportType, expiration, outputFormat, filename, imageResampleRes, isCmyk, cloudStorage, pdfStandard, postactionS3Filekey, postactionS3Bucket, meta, async, webhookUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiIntegrationApi#createPdfFromHtml");
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
| **createPdfFromHtmlRequest** | [**CreatePdfFromHtmlRequest**](CreatePdfFromHtmlRequest.md)|  | |
| **exportType** | **String**| - Either &#x60;file&#x60; or &#x60;json&#x60;(Default).   - The option &#x60;json&#x60; returns a JSON object, and the output PDF is stored on a CDN. Use this with the parameter &#x60;expiration&#x60;   - The option &#x60;file&#x60; returns binary data of the generated PDF(Secure and completely private) and the response HTTP header Content-Disposition is set to attachment.  | [optional] |
| **expiration** | **Integer**| - Expiration of the generated PDF in minutes(default to &#x60;0&#x60;, store permanently)   - Use &#x60;0&#x60; to store on cdn permanently   - Or use the range between &#x60;1&#x60; minute and &#x60;10080&#x60; minutes(7 days) to specify the expiration of the generated PDF  | [optional] |
| **outputFormat** | **String**| - Either &#x60;pdf&#x60;(Default) or &#x60;html&#x60;. - It&#39;s generating PDF by default. However, you can specify output_format&#x3D;html to generate only HTML(It will return in the JSON response as download_url field as a URL).  | [optional] |
| **filename** | **String**| - Default to UUID (e.g 0c93bd9e-9ebb-4634-a70f-de9131848416.pdf). Use this to specify custom file name, it should end with &#x60;.pdf&#x60;  | [optional] |
| **imageResampleRes** | **String**| - We embed the original images by default, meaning large PDF file sizes. Specifying the option &#39;image_resample_res&#39; helps reduce the PDF file size by downsampling the images of the current PDF to a resolution(in DPI). Common values are 72, 96, 150, 300 and 600.  | [optional] |
| **isCmyk** | **String**| - Use CMYK color profile, 1&#x3D;true, 0&#x3D;false. Default to &#39;0&#39;  | [optional] |
| **cloudStorage** | **Integer**| - Upload the generated PDFs/images to our storage CDN, default to &#x60;1&#x60;. If you have configured &#x60;Post Action&#x60; to upload the PDFs/Images to your own S3, please set it to &#x60;0&#x60;.  | [optional] |
| **pdfStandard** | **String**| Default to PDF1.4. Options are PDFA1B, PDFA2 and PDFA3 (This is an experimental feature)  | [optional] |
| **postactionS3Filekey** | **String**| - This is to specify the file name for &#x60;Post Action(S3 Storage)&#x60;. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter  | [optional] |
| **postactionS3Bucket** | **String**| - This is to overwrite the AWS Bucket for &#x60;Post Action(S3 Storage)&#x60;.  | [optional] |
| **meta** | **String**| - Specify an external reference ID for your own reference. It appears in the &#x60;list-objects&#x60; API.  | [optional] |
| **async** | **String**| - Either &#x60;1&#x60; or &#x60;0&#x60;(Default).  &#x60;0&#x60; is synchronous call(default), &#x60;1&#x60; is asynchronous call - To generate PDF asynchronously, set the value to &#x60;1&#x60; and the API call returns immediately. Once the PDF document is generated, we will make a HTTP/HTTPS GET to your URL(webhook_url) and will retry for 3 times before giving up. - If &#x60;async&#x60; is set to &#x60;1&#x60;, then &#x60;webhook_url&#x60; is mandatory  | [optional] |
| **webhookUrl** | **String**| - It is the URL of your webhook URL, it starts with http:// or https:// and has to be urlencoded. - If &#x60;async&#x60; is set to &#x60;1&#x60;, then you have to specify the &#x60;webhook_url&#x60;.   #### Format of Webhook callback  Once the PDF is generated, we will initiate a HTTP/HTTPS GET call to the following URL:  https://&#x60;[yourwebserver.com]&#x60;?&amp;primary_url&#x3D;&#x60;[primary_url]&#x60;&amp;transaction_ref&#x3D;&#x60;[transaction_ref]&#x60;&amp;status&#x3D;&#x60;[status]&#x60;&amp;message&#x3D;&#x60;[message]&#x60;  - &#x60;[yourwebserver.com]&#x60;: The web services to handle the callback, which is the &#x60;webhook_url&#x60; - &#x60;[primary_url]&#x60;: The URL to the PDF document - &#x60;[transaction_ref]&#x60;: The transaction reference number - &#x60;[status]&#x60; : Status of the transaction, either &#x60;success&#x60; or &#x60;error&#x60; - &#x60;[message]&#x60; : Status message  ***The following is a sample webhook call back to your server***  https://yourwebserver.com?&amp;primary_url&#x3D;https%3A%2F%2Fpub-cdn.apitemplate.io%2F2021%2F06%2Fb692183d-46d7-3213-891a-460a5814ad3f.pdf&amp;transaction_ref&#x3D;b692183d-46d7-3213-891a-460a5814ad3f&amp;status&#x3D;success  | [optional] |

### Return type

[**ResponseSuccessPDFFile**](ResponseSuccessPDFFile.md)

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

<a id="createPdfFromUrl"></a>
# **createPdfFromUrl**
> ResponseSuccessPDFFile createPdfFromUrl(createPdfFromUrlRequest, exportType, expiration, outputFormat, filename, imageResampleRes, isCmyk, cloudStorage, pdfStandard, postactionS3Filekey, postactionS3Bucket, meta, async, webhookUrl)

Create a PDF from URL

- This endpoint creates a PDF file from a URL 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ApiIntegrationApi apiInstance = new ApiIntegrationApi(defaultClient);
    CreatePdfFromUrlRequest createPdfFromUrlRequest = new CreatePdfFromUrlRequest(); // CreatePdfFromUrlRequest | 
    String exportType = "json"; // String | - Either `file` or `json`(Default).   - The option `json` returns a JSON object, and the output PDF is stored on a CDN. Use this with the parameter `expiration`   - The option `file` returns binary data of the generated PDF(Secure and completely private) and the response HTTP header Content-Disposition is set to attachment. 
    Integer expiration = 5; // Integer | - Expiration of the generated PDF in minutes(default to `0`, store permanently)   - Use `0` to store on cdn permanently   - Or use the range between `1` minute and `10080` minutes(7 days) to specify the expiration of the generated PDF 
    String outputFormat = "pdf"; // String | - Either `pdf`(Default) or `html`. - It's generating PDF by default. However, you can specify output_format=html to generate only HTML(It will return in the JSON response as download_url field as a URL). 
    String filename = "invoice_89326.pdf"; // String | - Default to UUID (e.g 0c93bd9e-9ebb-4634-a70f-de9131848416.pdf). Use this to specify custom file name, it should end with `.pdf` 
    String imageResampleRes = "150"; // String | - We embed the original images by default, meaning large PDF file sizes. Specifying the option 'image_resample_res' helps reduce the PDF file size by downsampling the images of the current PDF to a resolution(in DPI). Common values are 72, 96, 150, 300 and 600. 
    String isCmyk = "0"; // String | - Use CMYK color profile, 1=true, 0=false. Default to '0' 
    Integer cloudStorage = 1; // Integer | - Upload the generated PDFs/images to our storage CDN, default to `1`. If you have configured `Post Action` to upload the PDFs/Images to your own S3, please set it to `0`. 
    String pdfStandard = "pdfStandard_example"; // String | Default to PDF1.4. Options are PDFA1B, PDFA2 and PDFA3 (This is an experimental feature) 
    String postactionS3Filekey = "postactionS3Filekey_example"; // String | - This is to specify the file name for `Post Action(S3 Storage)`. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter 
    String postactionS3Bucket = "postactionS3Bucket_example"; // String | - This is to overwrite the AWS Bucket for `Post Action(S3 Storage)`. 
    String meta = "inv-iwj343jospig"; // String | - Specify an external reference ID for your own reference. It appears in the `list-objects` API. 
    String async = "0"; // String | - Either `1` or `0`(Default).  `0` is synchronous call(default), `1` is asynchronous call - To generate PDF asynchronously, set the value to `1` and the API call returns immediately. Once the PDF document is generated, we will make a HTTP/HTTPS GET to your URL(webhook_url) and will retry for 3 times before giving up. - If `async` is set to `1`, then `webhook_url` is mandatory 
    String webhookUrl = "https://yourwebserver.com"; // String | - It is the URL of your webhook URL, it starts with http:// or https:// and has to be urlencoded. - If `async` is set to `1`, then you have to specify the `webhook_url`.   #### Format of Webhook callback  Once the PDF is generated, we will initiate a HTTP/HTTPS GET call to the following URL:  https://`[yourwebserver.com]`?&primary_url=`[primary_url]`&transaction_ref=`[transaction_ref]`&status=`[status]`&message=`[message]`  - `[yourwebserver.com]`: The web services to handle the callback, which is the `webhook_url` - `[primary_url]`: The URL to the PDF document - `[transaction_ref]`: The transaction reference number - `[status]` : Status of the transaction, either `success` or `error` - `[message]` : Status message  ***The following is a sample webhook call back to your server***  https://yourwebserver.com?&primary_url=https%3A%2F%2Fpub-cdn.apitemplate.io%2F2021%2F06%2Fb692183d-46d7-3213-891a-460a5814ad3f.pdf&transaction_ref=b692183d-46d7-3213-891a-460a5814ad3f&status=success 
    try {
      ResponseSuccessPDFFile result = apiInstance.createPdfFromUrl(createPdfFromUrlRequest, exportType, expiration, outputFormat, filename, imageResampleRes, isCmyk, cloudStorage, pdfStandard, postactionS3Filekey, postactionS3Bucket, meta, async, webhookUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiIntegrationApi#createPdfFromUrl");
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
| **createPdfFromUrlRequest** | [**CreatePdfFromUrlRequest**](CreatePdfFromUrlRequest.md)|  | |
| **exportType** | **String**| - Either &#x60;file&#x60; or &#x60;json&#x60;(Default).   - The option &#x60;json&#x60; returns a JSON object, and the output PDF is stored on a CDN. Use this with the parameter &#x60;expiration&#x60;   - The option &#x60;file&#x60; returns binary data of the generated PDF(Secure and completely private) and the response HTTP header Content-Disposition is set to attachment.  | [optional] |
| **expiration** | **Integer**| - Expiration of the generated PDF in minutes(default to &#x60;0&#x60;, store permanently)   - Use &#x60;0&#x60; to store on cdn permanently   - Or use the range between &#x60;1&#x60; minute and &#x60;10080&#x60; minutes(7 days) to specify the expiration of the generated PDF  | [optional] |
| **outputFormat** | **String**| - Either &#x60;pdf&#x60;(Default) or &#x60;html&#x60;. - It&#39;s generating PDF by default. However, you can specify output_format&#x3D;html to generate only HTML(It will return in the JSON response as download_url field as a URL).  | [optional] |
| **filename** | **String**| - Default to UUID (e.g 0c93bd9e-9ebb-4634-a70f-de9131848416.pdf). Use this to specify custom file name, it should end with &#x60;.pdf&#x60;  | [optional] |
| **imageResampleRes** | **String**| - We embed the original images by default, meaning large PDF file sizes. Specifying the option &#39;image_resample_res&#39; helps reduce the PDF file size by downsampling the images of the current PDF to a resolution(in DPI). Common values are 72, 96, 150, 300 and 600.  | [optional] |
| **isCmyk** | **String**| - Use CMYK color profile, 1&#x3D;true, 0&#x3D;false. Default to &#39;0&#39;  | [optional] |
| **cloudStorage** | **Integer**| - Upload the generated PDFs/images to our storage CDN, default to &#x60;1&#x60;. If you have configured &#x60;Post Action&#x60; to upload the PDFs/Images to your own S3, please set it to &#x60;0&#x60;.  | [optional] |
| **pdfStandard** | **String**| Default to PDF1.4. Options are PDFA1B, PDFA2 and PDFA3 (This is an experimental feature)  | [optional] |
| **postactionS3Filekey** | **String**| - This is to specify the file name for &#x60;Post Action(S3 Storage)&#x60;. - Please do not specify the file extension - Please make sure the file name is unique - You might use slash (/) as the folder delimiter  | [optional] |
| **postactionS3Bucket** | **String**| - This is to overwrite the AWS Bucket for &#x60;Post Action(S3 Storage)&#x60;.  | [optional] |
| **meta** | **String**| - Specify an external reference ID for your own reference. It appears in the &#x60;list-objects&#x60; API.  | [optional] |
| **async** | **String**| - Either &#x60;1&#x60; or &#x60;0&#x60;(Default).  &#x60;0&#x60; is synchronous call(default), &#x60;1&#x60; is asynchronous call - To generate PDF asynchronously, set the value to &#x60;1&#x60; and the API call returns immediately. Once the PDF document is generated, we will make a HTTP/HTTPS GET to your URL(webhook_url) and will retry for 3 times before giving up. - If &#x60;async&#x60; is set to &#x60;1&#x60;, then &#x60;webhook_url&#x60; is mandatory  | [optional] |
| **webhookUrl** | **String**| - It is the URL of your webhook URL, it starts with http:// or https:// and has to be urlencoded. - If &#x60;async&#x60; is set to &#x60;1&#x60;, then you have to specify the &#x60;webhook_url&#x60;.   #### Format of Webhook callback  Once the PDF is generated, we will initiate a HTTP/HTTPS GET call to the following URL:  https://&#x60;[yourwebserver.com]&#x60;?&amp;primary_url&#x3D;&#x60;[primary_url]&#x60;&amp;transaction_ref&#x3D;&#x60;[transaction_ref]&#x60;&amp;status&#x3D;&#x60;[status]&#x60;&amp;message&#x3D;&#x60;[message]&#x60;  - &#x60;[yourwebserver.com]&#x60;: The web services to handle the callback, which is the &#x60;webhook_url&#x60; - &#x60;[primary_url]&#x60;: The URL to the PDF document - &#x60;[transaction_ref]&#x60;: The transaction reference number - &#x60;[status]&#x60; : Status of the transaction, either &#x60;success&#x60; or &#x60;error&#x60; - &#x60;[message]&#x60; : Status message  ***The following is a sample webhook call back to your server***  https://yourwebserver.com?&amp;primary_url&#x3D;https%3A%2F%2Fpub-cdn.apitemplate.io%2F2021%2F06%2Fb692183d-46d7-3213-891a-460a5814ad3f.pdf&amp;transaction_ref&#x3D;b692183d-46d7-3213-891a-460a5814ad3f&amp;status&#x3D;success  | [optional] |

### Return type

[**ResponseSuccessPDFFile**](ResponseSuccessPDFFile.md)

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

<a id="deleteObject"></a>
# **deleteObject**
> ResponseSuccessDeleteObject deleteObject(transactionRef)

Delete an Object

Delete a PDF or an image from CDN and mark the transaction as deleted 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ApiIntegrationApi apiInstance = new ApiIntegrationApi(defaultClient);
    String transactionRef = "1618d386-2343-3d234-b9c7-99c82bb9f104"; // String | Object transaction reference
    try {
      ResponseSuccessDeleteObject result = apiInstance.deleteObject(transactionRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiIntegrationApi#deleteObject");
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
| **transactionRef** | **String**| Object transaction reference | |

### Return type

[**ResponseSuccessDeleteObject**](ResponseSuccessDeleteObject.md)

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

<a id="listObjects"></a>
# **listObjects**
> ResponseSuccessListObjects listObjects(limit, offset, templateId, transactionType)

List Generated Objects

Retrieves all the generated PDFs and images 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.apitemplate.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ApiIntegrationApi apiInstance = new ApiIntegrationApi(defaultClient);
    String limit = "300"; // String | Retrieve only the number of records specified. Default to 300
    String offset = "0"; // String | Offset is used to skip the number of records from the results. Default to 0
    String templateId = "00377b2b1e0ee394"; // String | Filtered by template id
    String transactionType = "MERGE"; // String | Filtered by transaction type, options are `PDF`, `JPEG` or `MERGE`
    try {
      ResponseSuccessListObjects result = apiInstance.listObjects(limit, offset, templateId, transactionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiIntegrationApi#listObjects");
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
| **templateId** | **String**| Filtered by template id | [optional] |
| **transactionType** | **String**| Filtered by transaction type, options are &#x60;PDF&#x60;, &#x60;JPEG&#x60; or &#x60;MERGE&#x60; | [optional] |

### Return type

[**ResponseSuccessListObjects**](ResponseSuccessListObjects.md)

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

