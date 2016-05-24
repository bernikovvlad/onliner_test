package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(css = "div.auth-bar__item.auth-bar__item--text")
    private WebElement auth_bar;
    @FindBy(css = "input.auth-box__input")
    private WebElement auth_box;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement pass;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement button;
    @FindBy(linkText = "Выйти")
    private WebElement linkText;
    @FindBy(linkText = "1941936")
    private WebElement automation_test1;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void login(String username, String password)
    {

        auth_bar.click();
        auth_box.clear();
        auth_box.sendKeys(username);
        pass.click();
        pass.clear();
        pass.sendKeys(password);
        button.click();
    }
    public void logout(String username, String password){

        auth_bar.click();
        auth_box.clear();
        auth_box.sendKeys(username);
        pass.click();
        pass.clear();
        pass.sendKeys(password);
        button.click();
        linkText.click();
    }

    public boolean islogout(){
        boolean logOutIsTrue=false;
        if(driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).isDisplayed()) logOutIsTrue=true;
        return  logOutIsTrue;
    }

    public boolean islogin(){
        return automation_test1.isDisplayed();

    }
}