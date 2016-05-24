package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessage extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";
    @FindBy(css = "div.auth-bar__item.auth-bar__item--text")
    private WebElement auth_bar;
    @FindBy(css = "input.auth-box__input")
    private WebElement auth_box;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement pas;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement button;
    @FindBy(linkText = "Cообщения")
    private WebElement linkText;
    @FindBy(linkText = "Написать")
    private WebElement linkText1;
    @FindBy(id = "compose_uname")
    private WebElement uname;
    @FindBy(id = "compose_subject")
    private WebElement subject;
    @FindBy(id = "compose_text")
    private WebElement textt;
    @FindBy(name = "post")
    private WebElement post;
    @FindBy(linkText = "Отправленные")
    private WebElement linkText2;
    @FindBy(id = "l_sentbox_tm")
    private WebElement sentbox;

    public SendMessage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void sendmessage(String name,String username,String pass,String text)
    {
        auth_bar.click();
        auth_box.clear();
        auth_box.sendKeys(username);
        pas.click();
        pas.clear();
        pas.sendKeys(pass);
        button.click();
        linkText.click();
        linkText1.click();
        uname.clear();
        uname.sendKeys(name);
        subject.click();
        subject.clear();
        subject.sendKeys(text);
        textt.click();
        textt.clear();
        textt.sendKeys(text);
        post.click();
        linkText2.click();
    }

    public boolean issendmessage(){
        return sentbox.getText().contains("1");
    }
}