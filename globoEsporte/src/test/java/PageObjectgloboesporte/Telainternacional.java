package PageObjectgloboesporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Telainternacional {

	
	
	public void escolhermenu(WebDriver nave, String futebolInternacional ) {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	
	
	
	Actions actions = new Actions(nave);
	WebElement futebolInternacional1 = nave.findElement(By.xpath("//*[@id=\"header-produto\"]/div[2]/div/div/div[1]/div/span")) ;
	actions.moveToElement(futebolInternacional1);

	WebElement subLink = nave.findElement(By.xpath("//*[@id=\"menu-1-futebol-internacional\"]/a"));
	actions.moveToElement(subLink);
	actions.click();
	actions.perform();
	String au="";
	
	}
	
	
	
}

	

