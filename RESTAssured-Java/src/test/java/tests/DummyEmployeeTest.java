package tests;

import io.restassured.response.Response;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.Utils;

public class DummyEmployeeTest {
    Utils session;
    public Response res;
    private static String baseuri = "dummy_v1_employee";
    private static String api = "api.dummy_v1_employee";


    @Test
    public void contract_Get_Dummy_V1_Employee() {
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