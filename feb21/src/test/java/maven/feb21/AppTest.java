package maven.feb21;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	
	@Test
	public void LaunchChrome()
	{
	System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
