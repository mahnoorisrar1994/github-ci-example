package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private App app;

    /**
     * Rigorous Test :-)
     */
    @Before
    public void setup(){
        app = new App();
    }
    @Test
    public void testSayHello(){
        assertEquals("Hello", app.sayHello());
    }
}
