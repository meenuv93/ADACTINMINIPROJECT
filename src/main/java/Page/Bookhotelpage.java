package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotelpage {

    WebDriver driver;

    // Constructor
    public Bookhotelpage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // First Name
    @FindBy(id="first_name")
    WebElement firstname;

    public void firstname(String fname)
    {
        firstname.sendKeys(fname);
    }

    // Last Name
    @FindBy(id="last_name")
    WebElement lastname;

    public void lastname(String lname)
    {
        lastname.sendKeys(lname);
    }

    // Address
    @FindBy(id="address")
    WebElement address;

    public void address(String add)
    {
        address.sendKeys(add);
    }

    // Card Number
    @FindBy(id="cc_num")
    WebElement cardnumber;

    public void cardnumber(String card)
    {
        cardnumber.sendKeys(card);
    }

    // Card Type
    @FindBy(id="cc_type")
    WebElement cardtype;

    public void cardtype(String type)
    {
        cardtype.sendKeys(type);
    }

    // Month
    @FindBy(id="cc_exp_month")
    WebElement month;

    public void month(String mon)
    {
        month.sendKeys(mon);
    }

    // Year
    @FindBy(id="cc_exp_year")
    WebElement year;

    public void year(String yr)
    {
        year.sendKeys(yr);
    }

    // CVV
    @FindBy(id="cc_cvv")
    WebElement cvv;

    public void cvv(String cv)
    {
        cvv.sendKeys(cv);
    }

    // Book Now Button
    @FindBy(id="book_now")
    WebElement booknow;

    public void booknow()
    {
        booknow.click();
    }
}