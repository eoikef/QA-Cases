package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Utils {

    public RequestSpecification Request = RestAssured.given();
    public  String path;
    public  String method;
    public  String responseSchema;
    public  int successStatusCode;
    public Response res;
    public YamlReader apiconfig;
    public String filepath=System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "api" + File.separator + "api.yaml";
    public static String applicationdata=System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "base_uri" +File.separator + "uri.yaml";
    public static YamlReader applicationconfig = new YamlReader(applicationdata);

    public Utils createSession(String apiEndpoint, String baseUri){

        apiconfig = new YamlReader(filepath);
        this.method=apiconfig.get(apiEndpoint+".method");
        this.responseSchema=apiconfig.get(apiEndpoint+".responseSchema");
        this.path=apiconfig.get(apiEndpoint+".path");
        try {
            this.successStatusCode = Integer.parseInt(apiconfig.get(apiEndpoint+".successStatusCode"));
        }
        catch (Exception e){
            System.out.println("error status code");
        }
        this.getDefaultHttpRequestHeader(baseUri);
        return this ;

    }

    private  RequestSpecification getDefaultHttpRequestHeader(String baseUri) {
        if(baseUri.equalsIgnoreCase("jsonplaceholder_posts")){
            RequestSpecification spec = new RequestSpecBuilder().setBaseUri(applicationconfig.get("uri.jsonplaceholder_posts.url")).build();
            return this.Request=RestAssured.given(spec).contentType("application/json\r\n").header("Accept", "application/json")
                    .header("User-Agent", "PostmanRuntime/7.20.1")
                    .header("Cache-Control", "no-cache");
        }
        else if (baseUri.equalsIgnoreCase("dummy_v1_employee")){
            RequestSpecification spec = new RequestSpecBuilder().setBaseUri(applicationconfig.get("uri.dummy_v1_employee.url")).build();
            return this.Request=RestAssured.given(spec).header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        }
        else{
            return this.Request;
        }

    }

    public Response verb(){
        switch(method.toLowerCase()){
            case "get":
                this.res=this.Request.get(this.path);
                break;
            case "post":
                this.res=this.Request.post(this.path);
                break;
            case "put":
                this.res=this.Request.put(this.path);
                break;
            case "delete":
                this.res=this.Request.delete(this.path);
                break;
        }
        return this.res;
    }

    public Utils hasValidResponseSchema(){
        this.res.then().assertThat().body(matchesJsonSchemaInClasspath("responseSchema/"+this.responseSchema+".json"));
        return this;
    }

    public Utils hasValidStatusCode(){
        Assert.assertEquals(this.successStatusCode,this.res.getStatusCode());
        return this;
    }

    public Utils update_url(String key, String value) {
        this.path = this.path.replace("{" + key + "}", value);
        return this;
    }



}