package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public class DemoDriver {

    // This will set the driver --> On the basis of browser type
    /*
    * 1. Local env --> in your server, mac/windows
    * 2. Cloud env --> Third party cloud infrastructure
    *
    * */
    WebDriver driver = null;

    @Parameters({"os"})

    public void setUp(String broswerName, boolean cloudEnvironment){

        if(cloudEnvironment== true){


        }
        else{
            // Get local driver
        }

    }

    public WebDriver getLocalDriver(String os, String browserName){
        if(os == "Mac"){
            /**
             * Chrome
             * Firefox
             * IE
             * */
            if(browserName == "Chrome"){
                driver = new ChromeDriver();
                return driver;
            }
            else if(browserName == "FireFox"){
                driver = new FirefoxDriver();
                return driver;
            }
            else if(browserName == "IE"){
                driver = new InternetExplorerDriver();
                return driver;
            }
        }
        else if(os == "Widnows") {

            /**
             * Chrome
             * Firefox
             * IE
             * */
            if(browserName == "Chrome"){
                driver = new ChromeDriver();
                return driver;
            }
            else if(browserName == "FireFox"){
                driver = new FirefoxDriver();
                return driver;
            }
            else if(browserName == "IE"){
                driver = new InternetExplorerDriver();
                return driver;
            }

        }

        return driver;
    }

    public WebDriver getCloudDriver( String cloudEnvironmentName){
        //Get Cloud Environment
        if(cloudEnvironmentName == "browserstack"){
            //Get BrowserStack env
            return driver;
        }
        else {
            // get SauceLab
            return driver;
        }

    }

}
