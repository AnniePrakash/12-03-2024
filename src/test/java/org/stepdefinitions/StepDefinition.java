package org.stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	

		@Given("Facebook URL Launched")
		public void facebook_url_launched() {
			
			browserLaunch("chrome");
			maximize();
			loadUrl("https://www.facebook.com/");
					  
		}



		@When("User Enters Username")
		public void user_enters_username() {
			
			WebElement username = findElement("id", "email");
		 username.sendKeys("Hanno");
			
		 
		}
		@Then("TakeScreenshot")
		public void take_screenshot() throws IOException {
			
			File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\sujibatch\\facebook.png");
		  
			screenShot(file);
		}



	
	
	



}
