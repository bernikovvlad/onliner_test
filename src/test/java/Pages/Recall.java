package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recall extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(css = "div.auth-bar__item.auth-bar__item--text")
    private WebElement auth_bar;
    @FindBy(css = "input.auth-box__input")
    private WebElement auth_box;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement pass;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement button;
    @FindBy(css = "#widget-61 > a.b-tile-main > h3.b-tile-header > span.txt.max-lines-4")
    private WebElement title;
    @FindBy(xpath = "(//textarea[@name='message'])[2]")
    private WebElement message;
    @FindBy(xpath = "//div[@id='container']/div/div[2]/div/div/div[2]/div/div/form[2]/div/div[3]/button")
    private WebElement container;
    @FindBy(css = "#last_comment > strong.author > a")
    private WebElement strong_author;

    public Recall(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void recall(String username,String password,String text)
    {
        auth_bar.click();
        auth_box.clear();
        auth_box.sendKeys(username);
        pass.click();
        pass.clear();
        pass.sendKeys(password);
        button.click();
        title.click();
        message.click();
        message.click();
        message.clear();
        message.sendKeys(text);
        container.click();
    }

    public boolean isrecall(){
        return strong_author.getText().contains("automation_test");
    }
}