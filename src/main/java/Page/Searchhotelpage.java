package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchhotelpage
{
    public WebDriver driver;

    @FindBy(id="location")
    WebElement location;

    @FindBy(id="hotels")
    WebElement hotel;

    @FindBy(id="room_type")
    WebElement roomtype;

    @FindBy(id="room_nos")
    WebElement roomnumber;

    @FindBy(id="datepick_in")
    WebElement checkin;

    @FindBy(id="datepick_out")
    WebElement checkout;

    @FindBy(id="adult_room")
    WebElement adults;

    @FindBy(id="child_room")
    WebElement children;

    @FindBy(id="Submit")
    WebElement searchbutton;

    public Searchhotelpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void location(String loc)
    {
        Select s=new Select(location);
        s.selectByVisibleText(loc);
    }

    public void hotel(String h)
    {
        Select s=new Select(hotel);
        s.selectByVisibleText(h);
    }

    public void roomtype(String r)
    {
        Select s=new Select(roomtype);
        s.selectByVisibleText(r);
    }

    public void roomnumber(String n)
    {
        Select s=new Select(roomnumber);
        s.selectByVisibleText(n);
    }

    public void checkin(String in)
    {
        checkin.clear();
        checkin.sendKeys(in);
    }

    public void checkout(String out)
    {
        checkout.clear();
        checkout.sendKeys(out);
    }

    public void adults(String a)
    {
        Select s=new Select(adults);
        s.selectByVisibleText(a);
    }

    public void children(String c)
    {
        Select s=new Select(children);
        s.selectByVisibleText(c);
    }

    public void search()
    {
        searchbutton.click();
    }
}