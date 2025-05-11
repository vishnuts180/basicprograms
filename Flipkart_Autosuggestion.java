package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.google.in/");
		    driver.manage().window().maximize();
		    WebElement search=driver.findElement(By.name("q"));
		    search.sendKeys("shoe");
		    Thread.sleep(2000);
         List<WebElement> link=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
         WebElement m2=link.get(10-5);
         m2.click();

	}

}
