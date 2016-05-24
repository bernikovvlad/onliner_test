package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(name = "query")
    private WebElement query;
    @FindBy(linkText = "Холодильники")
    private WebElement refreger;

    public Search(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void search(String searcworld)
    {
        query.click();
        query.clear();
        query.sendKeys(searcworld);
    }

    public boolean issearch(){
              return  refreger.isDisplayed();
    }
    }