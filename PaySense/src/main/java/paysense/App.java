package paysense;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App 
{
	void setP() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gopaysense.com/");
		List<WebElement> topMenu=driver.findElements(By.xpath("//li[@class='nav-item']/following-sibling::li/*"));
		for(WebElement element : topMenu )
		{
			System.out.println(element.getText());
		}
		//Click on Other Loans
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='nav-sub-item']/child::label[text()=\"Other Loans\" and @tabindex='0']"))).perform();
		Thread.sleep(400);
		driver.findElement(By.xpath("//p[@class='title' and text()=\"Marriage Loan\"]")).click();
		System.out.println("Page title is " + driver.getTitle());
		driver.quit();
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App a=new App();
        try {
			a.setP();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
