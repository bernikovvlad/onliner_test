package Steps;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;
    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void closeDriver()
    {
        driver.close();
    }

    public void loginonliner(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("https://www.onliner.by");
        loginPage.login(username, password);
    }

    public boolean isloggedin()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.islogin());
    }

    public void logoutonliner(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("https://www.onliner.by");
        loginPage.logout(username,password);
    }

    public boolean isloggedout()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.islogout());
    }

    public void search(String searcword){
        Search search = new Search(driver);
        search.openPage("https://www.onliner.by");
        search.search(searcword);
    }

    public boolean issearched()
    {
        Search search = new Search(driver);
        return (search.issearch());
    }

    public void enterbasket(String username,String password) throws InterruptedException {
        EnterBasket enterbasket = new EnterBasket(driver);
        enterbasket.openPage("https://www.onliner.by");
        enterbasket.enterbasket(username,password);
    }

    public boolean isenterbasket()
    {
        EnterBasket enterbasket = new EnterBasket(driver);
        return (enterbasket.isenterbasket());
    }

    public void recall(String username,String password,String text){
        Recall recall = new Recall(driver);
        recall.openPage("https://www.onliner.by");
        recall.recall(username,password,text);
    }

    public boolean isrecall()
    {
        Recall recall = new Recall(driver);
        return (recall.isrecall());
    }

    public void sendMessage(String name,String username,String pass,String text){
        SendMessage sendMessage = new SendMessage(driver);
        sendMessage.openPage("https://www.onliner.by");
        sendMessage.sendmessage(name,username,pass,text);
    }

    public boolean issendMessage()
    {
        SendMessage sendMessage = new SendMessage(driver);
        return (sendMessage.issendmessage());
    }


    public void createtheme(String name,String username,String text,String header){
        CreateTheme createtheme = new CreateTheme(driver);
        createtheme.openPage("https://www.onliner.by");
        createtheme.createtheme(name,username,text,header);
    }

    public boolean iscreatetheme()
    {
        CreateTheme createtheme = new CreateTheme(driver);
        return (createtheme.iscreatetheme());
    }

    public void deletebasket(String username,String password) throws InterruptedException {
        DeleteBasket deletebasket = new DeleteBasket(driver);
        deletebasket.openPage("https://www.onliner.by");
        deletebasket.deletebasket(username,password);
    }
    public boolean isdeletebasket()
    {
        DeleteBasket deletebasket = new DeleteBasket(driver);
        return (deletebasket.isdeletebasket());
    }

    public void comment(String username,String password,String text) throws InterruptedException {
        Comment comment = new Comment(driver);
        comment.openPage("https://www.onliner.by");
        comment.comment(username,password,text);
    }

    public boolean iscomment()
    {
        Comment comment = new Comment(driver);
        return (comment.iscomment());
    }

    public void compare(String username,String password,String text) throws InterruptedException {
        Compare compare = new Compare(driver);
        compare.openPage("https://www.onliner.by");
        compare.compare(username,password,text);
    }
    public boolean iscompare()
    {
        Compare compare = new Compare(driver);
        return (compare.iscompare());
    }
    }


