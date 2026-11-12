package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register 
{
public WebDriver driver;

@FindBy(xpath = "//a[text()='New User Register Here']") WebElement z;
@FindBy(xpath = "//input[@id='username']") WebElement a;
@FindBy(xpath = "//input[@id='password']") WebElement b;
@FindBy(xpath = "//input[@id='re_password']") WebElement c;
@FindBy(xpath="//input[@id='full_name']") WebElement d;
@FindBy(xpath = "//input[@id='email_add']") WebElement e;
@FindBy(xpath = "//input[@id='captcha-form']") WebElement f;
@FindBy(xpath = "//input[@id='tnc_box']") WebElement g;
@FindBy(xpath = "//input[@id='Submit']") WebElement h;


public Register(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}

public void register()
{
z.click();	
}
public void username(String uname)
{
a.sendKeys("uname");	
}
public void password(String pass)
{
b.sendKeys("pass");
}
public void repassword(String repass)
{
c.sendKeys("repass");	
}
public void fullname(String fname)
{
d.sendKeys("fname");	
}
public void email(String mail)
{
e.sendKeys("mail");	
}
public void captchaform(String value)
{
f.sendKeys("value");	
}
public void termsandconditions()
{
g.click();	
}
public void registerclick()
{
h.click();	
}
public String url()
{
return driver.getCurrentUrl();	
}
}