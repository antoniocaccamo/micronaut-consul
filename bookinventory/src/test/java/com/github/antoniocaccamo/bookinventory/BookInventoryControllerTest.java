package com.github.antoniocaccamo.bookinventory;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * @author antoniocaccamo on 18/09/19
 */
public class BookInventoryControllerTest {

    private static  EmbeddedServer server;

    private static RxHttpClient rxclient;


    @BeforeClass
    public static void setup() {
        server = ApplicationContext.run(EmbeddedServer.class);
        rxclient = server.getApplicationContext()
                .createBean(RxHttpClient.class, server.getURL())
        ;
    }

    @AfterClass
    public static void stopServer() {
        if(server != null) {
            server.stop();
        }
        if(rxclient != null) {
            rxclient.stop();
        }
    }

    @Test
    public void testBooksController() {
        HttpResponse<Boolean> rsp = rxclient.toBlocking().exchange(HttpRequest.GET("/books/stock/1491950358"), Boolean.class);
        assertEquals(rsp.status(), HttpStatus.OK);
        assertTrue(rsp.body());
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testBooksControllerWithNonExistingIsbn() {
//        thrown.expect(HttpClientResponseException.class);
//        thrown.expect(hasProperty("response", hasProperty("status", is(HttpStatus.NOT_FOUND))));
//        rxclient.toBlocking().exchange(HttpRequest.GET("/books/stock/XXXXX"), Boolean.class);
    }
}
