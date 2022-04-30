package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_CompanyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_FirstName")).sendKeys("Sandhiya");
		driver.findElement(By.id("CreateLeadform_LastName")).sendKeys("Sandhiya");
		driver.findElement(By.id("submitButton")).click();
		String Text = driver.findElement(By.id("viewLead_companyName_Sandhiya")).getText();
		System.out.println("Company Name is:" +Text);
		
	}
}
