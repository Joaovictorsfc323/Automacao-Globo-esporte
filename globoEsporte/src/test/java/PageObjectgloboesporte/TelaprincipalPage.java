package PageObjectgloboesporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TelaprincipalPage {

	
	
	public void selecionartime(WebDriver nave, String time ) {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	
	
	
	Actions actions = new Actions(nave);
	WebElement times = nave.findElement(By.xpath("//*[@id=\"mosaico__wrapper\"]/div[1]/span")) ;
	actions.moveToElement(times);

	WebElement subLink = nave.findElement(By.xpath("//*[@id=\"tab-content-1\"]/div[18]/a"));
	actions.moveToElement(subLink);
	actions.click();
	actions.perform();
	//String au="";
	
	}
	
	
	
}
