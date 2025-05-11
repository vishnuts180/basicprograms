package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    WebElement fashion=driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(fashion).perform();
    WebElement e2=driver.findElement(By.linkText("Men's T-Shirts"));
    e2.click();
    
    
	}

}
