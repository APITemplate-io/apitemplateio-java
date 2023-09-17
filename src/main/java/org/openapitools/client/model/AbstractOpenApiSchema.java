/*
 * APITemplate.io API Reference
 * # Introduction   Welcome to the [APITemplate.io](https://apitemplate.io) API v2!  APITemplate.io provides PDF generation services including [Template-based PDF generation](https://apitemplate.io/pdf-generation-api/), [HTML to PDF](https://apitemplate.io/html-to-pdf-api/), and [URL to PDF conversions](https://apitemplate.io/create-pdf-from-url/), as well as an [image generation API](https://apitemplate.io/image-generation-api/).  This page contains the documentation on how to use APITemplate.io through API calls. With the APITemplate.io API, you can create PDF documents and images, as well as manage your templates.  Our API is built on RESTful HTTP, so you can utilize any HTTP/REST library of your choice in your preferred programming language to interact with APITemplate.io's API.  **Steps to produce PDFs/Images** 1. Design your template(s) using our intuitive drag-and-drop template editor or the HTML editor and save it. 2. Integrate your workflow, either with platforms like Zapier, Make.com/Integromat, Bubble.io, or any programming languages that support REST API, to send us the JSON data along with the template ID/URL/or HTML content. 3. Our REST API will then return a download URL for the images (in PNG and JPEG formats) or PDFs.  # Authentication Upon signing up for an account, an API key will be generated for you. If needed, you can reset this API key via the web console (under the \"API Integration\" section).  To integrate with our services, you need to authenticate with the APITemplate.io API. Provide your secret key in the request header using the X-API-KEY field.   # Content Type and CORS  **Request Content-Type** The Content-Type for POST and GET requests is set to application/json.  **Cross-Origin Resource Sharing** This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with  [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site.    # Regional API endpoint(s) A regional API endpoint is intended for customers in the same region. The data for the request and generated PDFs/images are processed and stored within the region.  The regions are:  | Region               | Endpoint                            | Max Timeout (Seconds) | Max Payload Size(MB)** | |----------------------|-------------------------------------|-----------------------|-------------------------| | Default (Singapore)  | https://rest.apitemplate.io         | 100                   | 1                       | | Europe (Frankfurt)   | https://rest-de.apitemplate.io      | 100                   | 1                       | | US East (N. Virginia)| https://rest-us.apitemplate.io      | 100                   | 1                       | | Australia (Sydney)   | https://rest-au.apitemplate.io      | 30                    | 6                       |   Alternative Regions: | Region               | Endpoint                            | Max Timeout (Seconds) | Max Payload Size(MB)** | |----------------------|-------------------------------------|-----------------------|-------------------------| | Default (Singapore)  | https://rest-alt.apitemplate.io     | 30                    | 6                       | | Europe (Frankfurt)   | https://rest-alt-de.apitemplate.io  | 30                    | 6                       | | US East (N. Virginia)| https://rest-alt-us.apitemplate.io  | 30                    | 6                       |  ** Note: - Payload size applies to request and response - If \"export_type\" is set to `json` which output file that on AWS S3 doesn't have the limitation - If the \"export_type\" is set to `file` which returns binary data of the generated PDF, the file size of the generated PDF is limited to either 6MB or 1MB based on the region    Other regions are available on request, contact us at hello@apitemplate.io for more information  # Rate limiting Our API endpoints use IP-based rate limiting to ensure fair usage and prevent abuse. Users are allowed to make up to **100 requests per 10 seconds**. This rate limit is designed to accommodate a reasonable volume of requests while maintaining optimal performance for all users.  However, if you exceed this limit and make additional requests, you will receive a response with HTTP code 429. This status code indicates that you have reached the rate limit and need to wait before making further requests. 
 *
 * The version of the OpenAPI document: Version 2.0
 * Contact: hello@apitemplate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.openapitools.client.ApiException;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.Map;

//import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Abstract class for oneOf,anyOf schemas defined in OpenAPI spec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-17T13:38:29.640715+08:00[Asia/Singapore]")
public abstract class AbstractOpenApiSchema {

    // store the actual instance of the schema/object
    private Object instance;

    // is nullable
    private Boolean isNullable;

    // schema type (e.g. oneOf, anyOf)
    private final String schemaType;

    public AbstractOpenApiSchema(String schemaType, Boolean isNullable) {
        this.schemaType = schemaType;
        this.isNullable = isNullable;
    }

    /**
     * Get the list of oneOf/anyOf composed schemas allowed to be stored in this object
     *
     * @return an instance of the actual schema/object
     */
    public abstract Map<String, Class<?>> getSchemas();

    /**
     * Get the actual instance
     *
     * @return an instance of the actual schema/object
     */
    //@JsonValue
    public Object getActualInstance() {return instance;}

    /**
     * Set the actual instance
     *
     * @param instance the actual instance of the schema/object
     */
    public void setActualInstance(Object instance) {this.instance = instance;}

    /**
     * Get the instant recursively when the schemas defined in oneOf/anyof happen to be oneOf/anyOf schema as well
     *
     * @return an instance of the actual schema/object
     */
    public Object getActualInstanceRecursively() {
        return getActualInstanceRecursively(this);
    }

    private Object getActualInstanceRecursively(AbstractOpenApiSchema object) {
        if (object.getActualInstance() == null) {
            return null;
        } else if (object.getActualInstance() instanceof AbstractOpenApiSchema) {
            return getActualInstanceRecursively((AbstractOpenApiSchema)object.getActualInstance());
        } else {
            return object.getActualInstance();
        }
    }

    /**
     * Get the schema type (e.g. anyOf, oneOf)
     *
     * @return the schema type
     */
    public String getSchemaType() {
        return schemaType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(getClass()).append(" {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractOpenApiSchema a = (AbstractOpenApiSchema) o;
        return Objects.equals(this.instance, a.instance) &&
            Objects.equals(this.isNullable, a.isNullable) &&
            Objects.equals(this.schemaType, a.schemaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, isNullable, schemaType);
    }

    /**
     * Is nullable
     *
     * @return true if it's nullable
     */
    public Boolean isNullable() {
        if (Boolean.TRUE.equals(isNullable)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }



}