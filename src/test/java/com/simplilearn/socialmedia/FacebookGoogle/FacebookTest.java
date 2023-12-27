package com.simplilearn.socialmedia.FacebookGoogle;


import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testFacebookTitle() {
  
        driver.get("https://www.facebook.com/");

        
        String pageTitle = driver.getTitle();

        
        assertEquals("Facebook – log in or sign up", pageTitle);
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            //driver.quit();
        }
    }
}
