package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Conditions of Use & Sale"));
	   WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	   search.sendKeys("shoes"+Keys.ENTER);
	   Set<String> s1=driver.getWindowHandles();
	   Iterator<String> i1=s1.iterator();
	   String w1=i1.next();
	   String w2=i1.next();
	   driver.switchTo().window(w2);
	   System.out.println(w1);
	   System.out.println(w2);
	  
	   
	 
	   
	   

	}

}
