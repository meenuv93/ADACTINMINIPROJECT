package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotelpage
{
    public WebDriver driver;

    @FindBy(id="radiobutton_0")
    WebElement selecthotel;

    @FindBy(id="continue")
    WebElement continuebutton;

    @FindBy(id="cancel")
    WebElement cancelbutton;

    public Selecthotelpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void selecthotel()
    {
        selecthotel.click();
    }

    public void continuebutton()
    {
        continuebutton.click();
    }

    public void cancel()
    {
        cancelbutton.click();
    }
}