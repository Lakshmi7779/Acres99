package stepdefinitions1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Locality_insights;

public class insights {

	
	WebDriver driver;
	
	@Before
	public void before() throws InterruptedException {
		driver=new EdgeDriver();
		//EdgeOptions opt = new EdgeOptions();
		//opt.addArguments("--disable-notifications");
		//driver = new EdgeDriver(opt);
		driver.get("https://www.99acres.com/");
        driver.manage().window().maximize();
//        String winHandle = driver.getWindowHandle();
//        Thread.sleep(1000);
//        driver.switchTo().frame(3);
	}

	@Given("I open the web browser")
	public void i_open_the_web_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I navigates to the application URL")
	public void i_navigates_to_the_application_url() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I should see the Home Page")
	public void i_should_see_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("I am on Home Page")
	public void i_am_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click on insights")
	public void i_click_on_insights() {
	    // Write code here that turns the phrase above into concrete actions
		Locality_insights l = new Locality_insights(driver);
		l.insights();
		

	}

	@When("I click on Locality insights")
	public void i_click_on_locality_insights() {
	    // Write code here that turns the phrase above into concrete actions
		Locality_insights l = new Locality_insights(driver);
		l.Localityinsights();
		l.skipopup();
	

	}
	@Then("I should get search results")
	public void i_should_get_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I navigates to Locality Insights successfully")
	public void i_navigates_to_locality_insights_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("I am on Locality Insights page")
	public void i_am_on_locality_insights_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	/*@When("I enter city as {string}")
	public void i_enter_city_as(String location) {
	    // Write code here that turns the phrase above into concrete actions
		Locality_insights l = new Locality_insights(driver);
		l.EnterLocation(location);
	    
	}*/
	@When("I enter location as {string}")
	public void i_enter_location_as(String location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		Locality_insights l = new Locality_insights(driver);
		l.EnterLocation(location);
	    
	}

	@When("click on search Locality Insights")
	public void click_on_search_locality_insights() {
	    // Write code here that turns the phrase above into concrete actions
		Locality_insights l = new Locality_insights(driver);
		l.Search();
	}

	@Then("I get searched Localitiies")
	public void i_get_searched_localitiies() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I scroll down the page")
	public void i_scroll_down_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I see frequently asked Questions")
	public void i_see_frequently_asked_questions() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I click on the question")
	public void i_click_on_the_question() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I scroll down the Insights page")
	public void i_scroll_down_the_insights_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click on view all insights")
	public void i_click_on_view_all_insights() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I successfully see all Insights and Tools")
	public void i_successfully_see_all_insights_and_tools() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
