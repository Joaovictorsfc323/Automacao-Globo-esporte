package PageObjectgloboesporte;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class globoesportePage {

	
	
	public void selecionartime(WebDriver nave, String time ) {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	
	
	
	Actions actions = new Actions(nave);
	WebElement menutimes = nave.findElement(By.xpath("//*[@id=\"mosaico__wrapper\"]/div[1]/span")) ;
	actions.moveToElement(menutimes);
	WebElement subLink = null;
	
	if(time.equalsIgnoreCase("Santos")) {
		subLink = nave.findElement(By.xpath("//*[@id=\"tab-content-1\"]/div[18]/a"));	
	}
	if(time.equalsIgnoreCase("Palmeiras")) {
		subLink = nave.findElement(By.xpath("//*[@id=\"tab-content-1\"]/div[17]/a"));	
	}
	
	actions.moveToElement(subLink);
	actions.click();
	actions.perform();
	//String au="";
	
	}

	public void coletotitulo(WebDriver nave, String time) {
		WebElement titulo = nave.findElement(By.xpath("//*[@id=\"header-produto\"]/div[2]/div/div/h1/div/a"));
		
		String txt_titulo_site = titulo.getText(); 
		
		
		Assert.assertEquals(time,txt_titulo_site);
	}
	
	
	
}
