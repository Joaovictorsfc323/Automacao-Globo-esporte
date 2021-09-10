package br.com.stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjectgloboesporte.ChromePageObject;
import PageObjectgloboesporte.TelaprincipalPage;
import PageObjectgloboesporte.Telainternacional;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class StepdefinitionGlobo extends ChromePageObject {


	ChromePageObject chromePageObject = new ChromePageObject();
	TelaprincipalPage telaprincipalpage = new TelaprincipalPage();
	Telainternacional telainternacional = new Telainternacional();
	public WebDriver nave;
	
	
	

	public WebDriver getNave() {
		return nave;
	}

	public void setNave(WebDriver nave) {
		this.nave = nave;
	}

	@Before
	public void beforeTest() {
		
	}
	
	@Dado("^que estou no site \"([^\"]*)\"$")
	public void que_estou_no_site(String url) throws Throwable {
	    setNave(chromePageObject.abrirNavegador(url));
	   
		
		
	}

	@Quando("^selecionar o \"([^\"]*)\"$")
	public void selecionar_o(String time) throws Throwable {
		telaprincipalpage.selecionartime(getNave(),time);
	  
	}
	
	@Quando("^clico no botao do time \"([^\"]*)\"$")
	public void clico_no_botao_do_time(String time) throws Throwable {
		telaprincipalpage.selecionartime(getNave(),time);
	    
	}

	@Quando("^escolher menu \"([^\"]*)\"$")
	public void escolher_menu(String futebolInternacional) throws Throwable {
		telainternacional.escolhermenu(getNave(),futebolInternacional);
	    
	}

	
	
	
	@Entao("^coleto a noticia \"([^\"]*)\"$")
	public void coleto_a_noticia(String arg1) throws Throwable {
	    
	}
	
	
	@After
	public void afterScenerio() {
		
	}
	
	
	
}
