package week4.day2;


import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		
		
		//1. Launch the URL https://www.chittorgarh.com/
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://chittorgarh.com");

		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
			//2. Click on stock market
		driver.findElement(By.partialLinkText("STOCK MARKET")).click();
		 //3. Click on NSE bulk Deals
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
			//4. Get all the Security names
	
		//print the Security Names
List<WebElement> securityNames = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[2]"));
        System.out.println("List size"+securityNames.size()); 
        for (int i =0; i < securityNames.size(); i++) {
       	  String names = securityNames.get(i).getText();
       	  
       	  //print the Security names only
       	  System.out.println(names);
			
				 
        }
		
		//5. Ensure whether there are duplicate Security names

        //convert List into set to check duplicate present or not
        
        Set<WebElement>dup=new LinkedHashSet<WebElement>(securityNames);
        System.out.println("set size"+dup.size());
         
        if(securityNames.size()==dup.size()) {
        	System.out.println("Yes ,duplicate Security names are displayed");
        }
        else {
        	System.out.println("Different Size");
        }
        
	}

}
