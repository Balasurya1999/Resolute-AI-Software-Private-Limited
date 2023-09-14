package org.StepDefinition;
import org.Base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facegenie_Application extends BaseClass

{	
	
	@Given("To Launch the Chrome Browser and Maximize the Window")
	public void to_Launch_the_Chrome_Browser_and_Maximize_the_Window() {
	
		launchBrowser();
		WindowMaximize();
	    
	}

	@When("To Launch the Facegenie URL")
	public void to_Launch_the_Facegenie_URL() {
		launchUrl("https://facegenie-ams-school.web.app/");
	    
	}

	@Then("To Pass the Valid Email")
	public void to_Pass_the_Valid_Email() {
		driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
	   
	}

	@Then("To Pass the Valid Password")
	public void to_Pass_the_Valid_Password() {
		driver.findElement(By.id("password")).sendKeys("facegenie");
	    
	}

	@Then("To Click the Login button")
	public void to_Click_the_Login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("To Click the Sync Todays Attendance")
	public void to_Click_the_Sync_Todays_Attendance() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Sync Todays Attendance']")));

//		WebDriverWait wait = new WebDriverWait(driver, 100);
//        WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sync Todays Attendance']")));
	
		
	}

	@Then("To Click the Attendance Logs Option")
	public void to_Click_the_Attendance_Logs_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Attendance Logs']")));
		
//		driver.findElement(By.xpath("//span[text()='Attendance Logs']")).click();
	    
	}

	@Then("To Click the AnalyticsReports Logs Option")
	public void to_Click_the_AnalyticsReports_Logs_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Analytics and Reports']")));
//		driver.findElement(By.xpath("//span[text()='Analytics and Reports']")).click();
		
	    
	}

	@Then("To Click the Manage Student Option")
	public void to_Click_the_Manage_Student_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Manage Student']")));
//		driver.findElement(By.xpath("//span[text()='Manage Student']")).click();
	    
	}

	@Then("To Click the License Option")
	public void to_Click_the_License_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Manage Licenses']")));
//		driver.findElement(By.xpath("//span[text()='Manage Licenses']")).click();
	    
	}

	@Then("To Click the Manage Sync Option")
	public void to_Click_the_Manage_Sync_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Manage Sync']")));
//		driver.findElement(By.xpath("//span[text()='Manage Sync']")).click();
	   
	}

	@Then("To Click the Setting Option")
	public void to_Click_the_Setting_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Setting']")));
//		driver.findElement(By.xpath("//span[text()='Setting']")).click();
	    
	}

	@Then("To Click the Log out Option")
	public void to_Click_the_Log_out_Option() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Log Out']")));
		  try {
	            // Attempt to switch to the alert
	            Alert alert = driver.switchTo().alert();
	            
	            // If an alert is present, you can accept, dismiss, or get text from it
	            // For example, to accept the alert:
	            alert.accept();
	        } catch (org.openqa.selenium.NoAlertPresentException e) {
	            // Handle the case where no alert is present
	            System.out.println("No alert is present on the page.");
	        }

		
//		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
	    
	}

	@Then("To close the Entire Browser")
	public void to_close_the_Entire_Browser() {
		CloseEntireBrowser();
	    
	}
}
