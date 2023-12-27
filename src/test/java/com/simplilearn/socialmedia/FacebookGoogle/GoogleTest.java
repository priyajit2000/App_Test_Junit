package com.simplilearn.socialmedia.FacebookGoogle;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    private WebDriver driver;

    @Before
    public void setUp() {
      
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleTitle() {
        
        driver.get("https://www.google.com/");

      
        String pageTitle = driver.getTitle();

        // Verify that the title matches the expected title
        assertEquals("Google", pageTitle);
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            //driver.quit();
        }
    }
}

