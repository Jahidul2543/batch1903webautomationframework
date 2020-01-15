package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class SampleBrowserDriver {

    /**
     *
     * All related activities of WebDriver
     * Creating WebDriver (Chrome Driver, FireFoxDriver)
     * Opening browser
     * Getting URL
     * Closing Browser
     *
     * */

    /*

     WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/batch1903webautomation/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }

    // Run cleanUp method every after @Test method
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    */
    public static WebDriver driver = null;

     public static String   os = System.getProperty("os", "windows");

            @Parameters({"url"})
            @BeforeMethod
            public void setUp( String url){

            System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/batch1903webautomationframework/generic/drivers/mac/chromedriver" );
            driver = new ChromeDriver();


            //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
            //driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
            //driver.manage().window().maximize();
                driver.get(url);

    }

    @AfterMethod
    public void closeOut() {
        //driver.manage().deleteAllCookies();
        driver.quit();
    }



}
