package page_objects;

import application_page_base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class HomePage {

    /**
     * All the web elements (locators) shall be available in this class
     * Associated methods
     *
     * */
    WebDriver driver = null;

    @FindBy(how = How.ID, using = "search_query_top")
    WebElement searchBox;

    @FindBy(how = How.NAME, using = "submit_search")
    WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using = "product-count")
    WebElement productcount;

    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    WebElement contactUs;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Sign in")
    private WebElement signInButton;

    public String search(){

        ApplicationPageBase.sendKeys("Search Box", searchBox, "T Shirt");
        searchButton.click();
        String actualValue =  productcount.getText();
        return actualValue;

        //Lets do some work
        // Helloooooooo
    }


    public void gotToContactUsPage(){
        contactUs.click();
    }

}
