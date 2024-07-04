package com.google;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AppTest {
    private WebDriver driver;

    @Before
    public void setup () {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\ProjectPoogle\\src\\driver\\Edge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue("Title should contain 'Google'", title.contains("Google"));

    }
    @After
    public void tearDown (){
        if (driver != null ){
            driver.quit();

        }
    }
}
