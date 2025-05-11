package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.google.in/");
		    driver.manage().window().maximize();
            List<WebElement> link=driver.findElements(By.tagName("a"));
            int count =link.size();
            for(int i=0;i<count;i++) {
            	WebElement m1=link.get(i);
            	String s1=m1.getText();
            System.out.println(s1);
            } 
	}

}
