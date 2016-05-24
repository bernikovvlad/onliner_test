package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Comment extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";

    @FindBy(css = "div.auth-bar__item.auth-bar__item--text")
    private WebElement auth_bar;
    @FindBy(css = "input.auth-box__input")
    private WebElement auth_box_input;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement auth_box_inpu;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement button1;
    @FindBy(xpath = "//div[@id='container']/div/div[2]/header/div/div/nav/ul/li[6]/a/span")
    private WebElement container;
    @FindBy(linkText = "Операторы связи")
    private WebElement linkText1;
    @FindBy(linkText = "Операторы связи")
    private WebElement linkText2;
    @FindBy(xpath = "//div[@id='minWidth']/div/div[2]/div[2]/div/div[4]/span/a/span/span")
    private WebElement container1;
    @FindBy(id = "postmessage")
    private WebElement postmessage1;
    @FindBy(css = "button[name=\"post\"]")
    private WebElement button2;
    @FindBy(css = "big.mtauthor-nickname.userid_1936650 > span > a._name.star-notes")
    private WebElement id_user;

    public Comment(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void comment(String username,String password,String text) throws InterruptedException {
        auth_bar.click();
        auth_box_input.click();
        auth_box_input.click();
        auth_box_input.click();
        auth_box_input.click();
        auth_box_input.clear();
        auth_box_input.sendKeys(username);
        auth_box_inpu.click();
        auth_box_inpu.clear();
        auth_box_inpu.sendKeys(password);
        button1.click();
        container.click();
        linkText1.click();
        linkText2.click();
        container1.click();
        postmessage1.clear();
        postmessage1.sendKeys(text);
        button2.click();
    }

    public boolean iscomment()
    {
        return id_user.isDisplayed();
    }
}
