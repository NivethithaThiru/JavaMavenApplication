package com.nivi.java;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void AppplicationTest()
    {
        App.main(null);
        try {
            String actual_message = AppTest.displayMessage();
            assertEquals("Hello Nivethitha!", actual_message);
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello Nivethitha!\"");
        }
    }

    public static String displayMessage()
    {
        return App.message;
    }

}