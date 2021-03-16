package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	@Given("I have entered {int} into the calculator")
	public void i_have_entered_into_the_calculator(Integer int1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paula\\eclipse\\java-2020-09\\eclipse\\drivers\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();                                                                                        //startar chrome
	    driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");                              //navigerar till hemsidan
	    Thread.sleep(1000);                                                                           // Let the user actually see something! //vänta i 1 sekund
	    
	    WebElement numberBox1 = driver.findElement(By.name("n01"));       
	    numberBox1.sendKeys("123");                                                 
	    numberBox1.click();
	    
	    WebElement numberBox2 = driver.findElement(By.name("n02"));
	    numberBox2.sendKeys("456"); 
	                                                                    

	  //  WebElement scissor = driver.findElement(By.id("ctl00_main_psl_ctl03_ctl04_imgProduct"));
	    
	   // boolean scissorDisplayed = scissor.isDisplayed();
	    
	    assertEquals(true, driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[1]/div/img")));
	    
	    driver.quit();                                                                //stänga ner chrome
	  
	}

	@Given("I have also entered {int} into the calculator")
	public void i_have_also_entered_into_the_calculator(Integer int1) {
	    
	}
	
	@When("I press add")
	public void i_press_add() {
	  
	}
	
	@Then("the result should be {int} on the screen")
	public void the_result_should_be_on_the_screen(Integer int1) {
	   
	}

}
