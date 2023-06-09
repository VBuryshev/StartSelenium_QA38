import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TableTest
{
    WebDriver wd;

    @BeforeMethod
    public void init()
    {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void testCss()
    {
        wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));


        // print amount of table rows
        WebElement tableRows = wd.findElement(By.cssSelector("#customers"));
        int rowCount = 0;
        for (WebElement row : tableRows.findElements(By.tagName("tr")))
        {
            rowCount++;
        }
        System.out.println("Amount of the table rows is - " + rowCount);

        //System.out.println(wd.findElements(By.cssSelector("#customers tr")).size());


        // print amount of table columns
        WebElement tableCol = wd.findElement(By.cssSelector("#customers"));
        WebElement firstRow = tableCol.findElement(By.tagName("tr"));
        int columnsCount = 0;
        for (WebElement columns : firstRow.findElements(By.tagName("th")))
        {
            columnsCount++;
        }
        System.out.println("Amount of the table columns is - " + columnsCount);

        //System.out.println(wd.findElements(By.cssSelector("#customers th")).size());

        // find locator for the row3
        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        // find locator for the last column
        wd.findElement(By.cssSelector("#customers td:last-child"));

    }

    @AfterMethod
    public void tearDown()

    {
        wd.quit();
    }
}
