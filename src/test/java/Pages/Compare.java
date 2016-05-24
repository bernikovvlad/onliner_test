package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compare extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(xpath = "//div[@id='container']/div/div[2]/div/div/div/div/div/ul/li[8]/a/span")
    private WebElement container;
    @FindBy(css = "span.i-checkbox.i-checkbox_yellow > span.i-checkbox__faux")
    private WebElement checkbox;
    @FindBy(xpath = "//div[@id='schema-products']/div[2]/div/div/div/div/label/span/span")
    private WebElement compare_products;
    @FindBy(linkText = "2 товара в сравнении")
    private WebElement linkText1;
    @FindBy(css = "h1.b-offers-title")
    private WebElement title;

    public Compare(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void compare(String username,String password,String text) throws InterruptedException {
        container.click();
        checkbox.click();
        compare_products.click();
        linkText1.click();
    }

    public boolean iscompare(){
        return title.getText().contains("Сравнение товаров");
    }
}
