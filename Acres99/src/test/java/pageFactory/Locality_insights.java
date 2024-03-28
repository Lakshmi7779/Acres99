package pageFactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Locality_insights {
	WebDriver driver;
	WebDriverWait wait;
	public Locality_insights(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[5]")
	WebElement insights;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[5]/div/ul/li[1]/div/div/div[2]/div[1]/div/div[2]")
	WebElement Localityinsights;
	@FindBy(xpath="//span[text()='Skip to all Insights']")
	WebElement skipopup;
	@FindBy(xpath="//*[@id=\"INSIGHTS_SEARCH\"]/div/div/div[1]/input")
	WebElement EnterLocation;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[4]/div/div[5]/div/div/div[2]/button/span")
	WebElement Search;
	
	public void insights()  {
//		insights.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(insights).perform();
		
	}
	public void Localityinsights(){
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Localityinsights.click();
		
	}
	public void skipopup() {
		skipopup.click();
	}
	
	public void EnterLocation(String location) {
		
		EnterLocation.sendKeys(location);
		
	}
	public void Search() {
		Search.click();
	}

}
