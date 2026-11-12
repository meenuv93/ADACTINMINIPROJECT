package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmationpage
{
    public WebDriver driver;

    @FindBy(id="order_no")
    WebElement ordernumber;

    @FindBy(id="my_itinerary")
    WebElement itinerary;

    @FindBy(id="logout")
    WebElement logout;

    public Bookingconfirmationpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getordernumber() throws InterruptedException
    {
    	Thread.sleep(1000);
        return ordernumber.getAttribute("value");
    }

    public void itinerary() throws InterruptedException
    {
    	Thread.sleep(1000);
        itinerary.click();
    }

    public void logout() throws InterruptedException
    {
    	Thread.sleep(1000);
        logout.click();
    }
}