package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTheme extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(css = "div.auth-bar__item.auth-bar__item--text")
    private WebElement button;
    @FindBy(css = "input.auth-box__input")
    private WebElement input_auth_box;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement input_pass;
    @FindBy(xpath = "(//button[@type='submit'])[2]']")
    private WebElement button1;
    @FindBy(xpath = "//div[@id='container']/div/div[2]/header/div/div/nav/ul/li[6]/a/span")
    private WebElement container;
    @FindBy(linkText = "Операторы связи")
    private WebElement linkText;
    @FindBy(id = "submit_text")
    private WebElement submit_text;
    @FindBy(id = "subject")
    private WebElement subject;
    @FindBy(id = "message")
    private WebElement message;
    @FindBy(id = "post")
    private WebElement post;
    @FindBy(css = "span.project-navigation__sign")
    private WebElement navigation;
    @FindBy(linkText = "меньше минуты назад")
    private WebElement linkText2;

    public CreateTheme(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void createtheme(String username,String password,String text,String header)
    {
        button.click();
        input_auth_box.click();
        input_auth_box.click();
        input_auth_box.clear();
        input_auth_box.sendKeys(username);
        input_pass.click();
        input_pass.clear();
        input_pass.sendKeys(password);
        button1.click();
        container.click();
        linkText.click();
        submit_text.click();
        subject.clear();
        subject.sendKeys(header);
        message.click();
        message.clear();
        message.sendKeys(text);
        post.click();
        navigation.click();
    }

    public boolean iscreatetheme()
    {
        return  linkText2.isDisplayed();
    }
}