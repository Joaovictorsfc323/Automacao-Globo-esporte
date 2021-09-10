package br.com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = "classpath:Feature/",
	plugin = "pretty",
	monochrome = true,
	tags = "@time1,@time2",
	glue = {"br.com.stepDefinition"})



public class runnerglobo {
	
	
}




