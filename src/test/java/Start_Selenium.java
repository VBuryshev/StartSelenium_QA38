import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.security.mscapi.CPublicKey;

public class Start_Selenium
{
    WebDriver wd;

    @BeforeTest
    public void precondition()
    {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void test()
    {
        //Old strategies CW_04
    wd.findElement(By.tagName("a"));
    wd.findElement(By.cssSelector("a"));

    wd.findElement(By.id("root"));
    wd.findElement(By.cssSelector("#root"));

    wd.findElement(By.className("container"));
    wd.findElement(By.cssSelector(".container"));

    wd.findElement(By.linkText("HOME"));
    wd.findElement(By.partialLinkText("OM"));

    wd.findElement(By.cssSelector("[href='/login']"));
    wd.findElement(By.cssSelector("[href*='og']"));
    wd.findElement(By.cssSelector("[href^='/log']"));
    wd.findElement(By.cssSelector("[href$='gin']"));

    //HW_04 Task 1
    wd.findElement(By.cssSelector("[href='/about']"));
    wd.findElement(By.cssSelector("[href*='bou']"));
    wd.findElement(By.cssSelector("[href^='/abo']"));
    wd.findElement(By.cssSelector("[href$='ut']"));

    //HW_04 Task 2


    }

    @AfterTest
    public void postcondition()
    {
    wd.quit();
    }
}
