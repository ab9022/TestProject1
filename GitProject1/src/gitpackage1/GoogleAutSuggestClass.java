package gitpackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleAutSuggestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
				 WebDriver dv=new FirefoxDriver();
				 dv.get("https://www.google.com");
				 //dv.manage().window().maximize();
				 dv.findElement(By.name("q")).sendKeys("Kolkata");
				 
				 Thread.sleep(200);
				 
				 List<WebElement> lst = dv.findElements(By.xpath("//*[@class='erkvQe']//following::li"));
				 
				 System.out.println(lst.size());
				 
				 for(int i=0;i<=lst.size();i++){
				  if(lst.get(i).getText().equals("kolkata airport")){
				   lst.get(i).click();
				   
				  }
	}

}
}
