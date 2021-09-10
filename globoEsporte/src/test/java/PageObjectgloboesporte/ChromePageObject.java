package PageObjectgloboesporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePageObject {
     private WebDriver driver;
	

   
	public WebDriver getDriver() {
		return driver;
	}



	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}



	public WebDriver abrirNavegador(String url) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\configuracaoAutomacao\\driver\\chromedriver_92\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		setDriver(driver);
		driver.get(url);
		
		
		return driver;
		
		
		
		
	}
	
		
}