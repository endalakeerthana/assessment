package assessmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitionn {
	WebDriver driver = new ChromeDriver();
	String url = "https://www.exercise1.com/values";
	@Given("^Open Chrome browser$")
	public void open_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    throw new PendingException();
	}
	
	@Given("^Enter url \"([^\"]*)\"$")
	public void enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	    throw new PendingException();
	}

	@When("^the user is on home page$")
	public void the_user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on home page");	
	    throw new PendingException();
	}

	@Then("^count of values on the screen are correct$")
	public void count_of_values_on_the_screen_are_correct() {
	    // Write code here that turns the phrase above into concrete actions4
		String value1=driver.findElement(By.id("txt_val_1")).getText();
		String value2=driver.findElement(By.id("txt_val_2")).getText();
		String value4=driver.findElement(By.id("txt_val_4")).getText();
		String value5=driver.findElement(By.id("txt_val_5")).getText();
		String value6=driver.findElement(By.id("txt_val_6")).getText();
		if(!(value1.isEmpty()) && !(value2.isEmpty()) && !(value4.isEmpty()) && !(value5.isEmpty()) && !(value6.isEmpty()))
		{
			System.out.println("count of values on the screen are correct");
		}
		else
		{
			System.out.println("count of values on the screen are not correct");
		}
	    throw new PendingException();
	}

	@Then("^values on the screen are greater than (\\d+)$")
	public void values_on_the_screen_are_greater_than() {
	    // Write code here that turns the phrase above into concrete actions
		String value1=driver.findElement(By.id("txt_val_1")).getText();  
		int value1_Int=Integer.parseInt(value1.substring(1));
		
		String value2=driver.findElement(By.id("txt_val_2")).getText();  
		int value2_Int=Integer.parseInt(value2.substring(1));
		
		String value4=driver.findElement(By.id("txt_val_4")).getText();  
		int value4_Int=Integer.parseInt(value4.substring(1));   
		
		String value5=driver.findElement(By.id("txt_val_5")).getText();  
		int value5_Int=Integer.parseInt(value5.substring(1));   
		
		String value6=driver.findElement(By.id("txt_val_6")).getText();  
		int value6_Int=Integer.parseInt(value6.substring(1));   
		
		if(value1_Int>0 && value2_Int>0 && value4_Int>0 && value5_Int>0 && value6_Int>0)
        {
			System.out.println("values on the screen are greater than zero");
        }
		else
        {
			System.out.println(" values on the screen are not greater than zero");
        }
	    throw new PendingException();
	}
	@Then("^values are formatted same as currencies$")
	public void values_are_formatted_same_as_currencies() {
	    // Write code here that turns the phrase above into concrete actions
		String value1=driver.findElement(By.id("txt_val_1")).getText();
		String value2=driver.findElement(By.id("txt_val_2")).getText();
		String value4=driver.findElement(By.id("txt_val_4")).getText();    
		String value5=driver.findElement(By.id("txt_val_5")).getText();    
		String value6=driver.findElement(By.id("txt_val_6")).getText();

		if((value1.startsWith("$")) && (value2.startsWith("$")) && (value4.startsWith("$")) && (value5.startsWith("$")) && (value6.startsWith("$")))
        {
			System.out.println("values are formatted same as currencies");
        }
        else
        {
        	System.out.println("values are formatted not same as currencies");
        }
	    throw new PendingException();
	}

	@Then("^total balance matches with the sum of values$")
	public void total_balance_matches_with_the_sum_of_values() {
	    // Write code here that turns the phrase above into concrete actions
		String value1=driver.findElement(By.id("txt_val_1")).getText();  
		int value1_Int=Integer.parseInt(value1.substring(1));
		
		String value2=driver.findElement(By.id("txt_val_2")).getText();  
		int value2_Int=Integer.parseInt(value2.substring(1));
		
		String value4=driver.findElement(By.id("txt_val_4")).getText();  
		int value4_Int=Integer.parseInt(value4.substring(1));   
		
		String value5=driver.findElement(By.id("txt_val_5")).getText();  
		int value5_Int=Integer.parseInt(value5.substring(1));   
		
		String value6=driver.findElement(By.id("txt_val_6")).getText();  
		int value6_Int=Integer.parseInt(value6.substring(1));   
		
		String total_balance=driver.findElement(By.id("txt_ttl_val")).getText();  
		int totalbalance_Int=Integer.parseInt(total_balance.substring(1));
        
	      //finding total
		  int sum=value1_Int+value2_Int+value4_Int+value5_Int+value6_Int;

          if(totalbalance_Int==sum)
           {
        	  System.out.println("total valuevalue  is verified and equal to the expected total");

           }
          else 
            {
        	  System.out.println("total valuevalue  is verified and not equal to the expected total----Invalid ");

            }
	    throw new PendingException();
	}
}
