package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
    public WebDriver driver;

    // Locators

    @FindBy(id = "username")
    WebElement i;

    @FindBy(id = "password")
    WebElement j;

    @FindBy(id = "login")
    WebElement k;

    // Constructor

    public Loginpage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Username

    public void username(String uname)
    {
        i.sendKeys(uname);
    }

    // Password

    public void password(String pass)
    {
        j.sendKeys(pass);
    }

    // Login button

    public void login()
    {
        k.click();
    }
}