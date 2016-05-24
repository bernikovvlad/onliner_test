package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterBasket extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(css = "div.auth-bar__item.auth-bar__item--text")
    private WebElement auth_bar;
    @FindBy(css = "input.auth-box__input")
    private WebElement auth_box;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement pass;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement button;
    @FindBy(css = "span.b-main-navigation__text")
    private WebElement navigation;
    @FindBy(xpath = "//div[@id='container']/div/div[2]/div/div/div/ul/li[4]/span")
    private WebElement container;
    @FindBy(linkText = "Холодильники")
    private WebElement linkText;
    @FindBy(css = "div.schema-product__title > a > span")
    private WebElement product;
    @FindBy(linkText = "В корзину")
    private WebElement linkText1;
    @FindBy(linkText = "1 товар")
    private WebElement linkText2;

    public EnterBasket(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void enterbasket(String username,String password) throws InterruptedException {
        auth_bar.click();
        auth_box.clear();
        auth_box.sendKeys(username);
        pass.click();
        pass.clear();
        pass.sendKeys(password);
        button.click();
        navigation.click();
        container.click();
        Thread.sleep(3000);
        linkText.click();
        product.click();
        Thread.sleep(6000);
        linkText1.click();
    }

    public boolean isenterbasket(){
        return linkText2.isDisplayed();
    }
}
