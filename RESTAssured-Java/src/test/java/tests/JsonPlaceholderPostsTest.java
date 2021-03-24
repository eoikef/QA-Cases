package tests;

import io.restassured.response.Response;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.Utils;

public class JsonPlaceholderPostsTest {
    Utils session;
    public Response res;
    private static String baseuri = "jsonplaceholder_posts";
    private static String api = "api.jsonplaceholder_posts";

    @Test
    public void contract_Get_JsonPlaceholder_Posts() {
        res = session.createSession(api, baseuri)
                .update_url("id", "1")
                .verb();
        session.hasValidStatusCode();
        session.hasValidResponseSchema();

    }

    @After
    public void teardownmethod() {
        session = null;
    }

    @Before
    public void setupmethod() {
        res = null;
        session = new Utils();
    }
}