package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Baseclass;
import Page.Bookhotelpage;
import Page.Bookingconfirmationpage;
import Page.Loginpage;
import Page.Searchhotelpage;
import Page.Selecthotelpage;


public class Testclass extends Baseclass
{
@Test(priority=0)
public void test1() throws InterruptedException
{

//URL verification
String u=driver.getCurrentUrl();
Assert.assertTrue(u.contains("adactinhotelapp"));

//Title verification
String t=driver.getTitle();
System.out.println(t);

Loginpage l = new Loginpage(driver);

l.username("Meenakshy");
Thread.sleep(1000);
l.password("qwerty");
Thread.sleep(1000);
l.login();

}

@Test(priority=1)
public void test2() throws InterruptedException
{
    Searchhotelpage s=new Searchhotelpage(driver);
    Thread.sleep(1000);

    // Select Location
    s.location("Sydney");
    Thread.sleep(1000);

    // Select Hotel
    s.hotel("Hotel Creek");
    Thread.sleep(1000);

    // Select Room Type  
    s.roomtype("Standard");
    Thread.sleep(1000);

    // Select Number of Rooms
    s.roomnumber("1 - One");
    Thread.sleep(1000);

    // Enter Check-in Date
    s.checkin("02/11/2026");
    Thread.sleep(1000);

    // Enter Check-out Date
    s.checkout("03/11/2026");
    Thread.sleep(1000);

    // Select Adults
    s.adults("2 - Two");
    Thread.sleep(1000);

    // Select Children
    s.children("1 - One");
    Thread.sleep(1000);

    // Click Search
    s.search();
    Thread.sleep(1000);
    Thread.sleep(1000);
	
}

@Test(priority=2)
public void test3() throws InterruptedException
{
    // Select Hotel

    Selecthotelpage s=new Selecthotelpage(driver);
    
    Thread.sleep(1000);

    s.selecthotel();
    Thread.sleep(1000);

    s.continuebutton();
    Thread.sleep(1000);
}

@Test(priority=3)
public void test4() throws InterruptedException
{
    // Book Hotel

    Bookhotelpage b = new Bookhotelpage(driver);

    b.firstname("Meenu");
    Thread.sleep(1000);

    b.lastname("Vijayan");
    Thread.sleep(1000);

    b.address("Kerala");
    Thread.sleep(1000);

    b.cardnumber("1234567890123456");
    Thread.sleep(1000);

    b.cardtype("VISA");
    Thread.sleep(1000);

    b.month("December");
    Thread.sleep(1000);

    b.year("2030");
    Thread.sleep(1000);

    b.cvv("123");
    Thread.sleep(1000);

    b.booknow();
    Thread.sleep(1000);
    Thread.sleep(1000);
}

@Test(priority=4)
public void test5() throws InterruptedException
{
    // Booking Confirmation

    Bookingconfirmationpage c=
            new Bookingconfirmationpage(driver);
    
    Thread.sleep(1000);

    System.out.println("Order Number: "
            + c.getordernumber());
    Thread.sleep(1000);

    c.logout();
    Thread.sleep(1000);
}
    
}





