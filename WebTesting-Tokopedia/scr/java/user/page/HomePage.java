package user.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Locator
    @FindBy (css = "[alt='tokopedia-logo']")
    private WebElement Home;
    @FindBy (css ="[placeholder='Cari di Tokopedia']")
    private WebElement searchBox;
    @FindBy (css = ".css-1czin5k")
    private WebElement searchButton;
    @FindBy (xpath = "//div[@class='css-8j9pkz']")
    private WebElement result;

    //Class
    public void setHome(){
        Home.getText();
    }
    public void searchClick(){
        searchButton.click();
    }
    public void productName(String product){
        searchBox.sendKeys(product);
    }
    public String totalItem(){
        return result.getText();
    }
}
