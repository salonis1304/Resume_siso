package ResumePackage;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ResumeAutoScript {

    public static void main(String[] args) throws InterruptedException
 {
    WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://127.0.0.1:5500/Resume_siso/ResumeBeta.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Saloni Sisodiya");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("salonisisodiya1999@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Phone No.']")).sendKeys("8209054437");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Current City']")).sendKeys("Jhalawar, Rajasthan");
		Thread.sleep(3000);
		
		//Royal datamatics pvt ltd Experience
		
		driver.findElement(By.xpath("//button[normalize-space()='Add Experience']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"experienceSection\"]/h3"));
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"experienceList\"]/div/input[1]")).sendKeys("Royal Datamatics Pvt Ltd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='designation']")).sendKeys("QA Engineer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Full Time']")).click();
		Thread.sleep(2000);
		//Joining Date 
		driver.findElement(By.xpath("//input[@placeholder='Joining Date']")).click();
		
		String reqmonthyear="May 2024";
		String reqdate= "13";
		
		while(true)
		{
			String currmonthyear= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")).getText();
			if(currmonthyear.equals(reqmonthyear))
			{
				break;
			}
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
			
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[1]//tbody//tr//td"));
		
		for(WebElement dates:alldates)
		{
			if(dates.getText().equals(reqdate))
			{
				dates.click();
				break;
			}
		}
		//Leaving Date
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Leaving Date']")).click();
        Thread.sleep(2000);
		String reqmonthyear1="January 2025";
		String reqdate1= "27";
		
		while(true)
		{
			String currmonthyear1= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]")).getText();
			if(currmonthyear1.equals(reqmonthyear1))
			{
				break;
			}
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[2]")).click();
			
		}
		
		List<WebElement> alldates1=driver.findElements(By.xpath("(//table)[2]//tbody/tr/td"));
		
		for(WebElement dates1:alldates1)
		{
			if(dates1.getText().equals(reqdate1))
			{
				dates1.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//textarea[@class='jobDescription']")).sendKeys("1) Study and Analysis of Test Requirements provided. Deriving Test scenarios, documented test cases, and \r\n"
				+ "collected test data. \r\n"
				+ "2) Developed Manual Test Cases for different Test scenarios covering all aspects of project functionality. \r\n"
				+ "3) Executed the test cases, recorded the results and documented defects in JIRA. \r\n"
				+ "4) Conducted API testing using Postman to validate request-response workflows. \r\n"
				+ "5) Client interaction via e-mail and conference calls on a weekly basis. \r\n"
				+ "6) Used to prepare Daily status and Weekly Status Reports Involved in helping the team members as and when \r\n"
				+ "needed. \r\n"
				+ "7) Kept track of reported defects throughout the testing process and work with developers and other team \r\n"
				+ "members to verify fixes and validate that issues have been resolved.");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		
		//A&D International pvt ltd experience
		
        driver.findElement(By.xpath("//button[normalize-space()='Add Experience']")).click();
        Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.xpath("//label[normalize-space()='Company Name']"));
		
		js.executeScript("arguments[0].scrollIntoView()", ele1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"experienceList\"]/div/input[1]")).sendKeys("A&D International Pvt Ltd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='designation']")).sendKeys("IT Operation Engineer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Full Time']")).click();
		Thread.sleep(2000);
		//Joining Date 
		driver.findElement(By.xpath("//input[@placeholder='Joining Date']")).click();
		
		String reqmonthyear2="October 2023";
		String reqdate2= "23";
		
		while(true)
		{
			String currmonthyear2= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div[1]/div/div/span")).getText();
			if(currmonthyear2.equals(reqmonthyear2))
			{
				break;
			}
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button[1]")).click();
			
		}
		
		List<WebElement> alldates2=driver.findElements(By.xpath("//table[1]//tbody//tr//td"));
		
		for(WebElement dates2:alldates2)
		{
			if(dates2.getText().equals(reqdate2))
			{
				dates2.click();
				break;
			}
		}
		//Leaving Date
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Leaving Date']")).click();
        Thread.sleep(2000);
		String reqmonthyear3="February 2024";
		String reqdate3= "19";
		
		while(true)
		{
			String currmonthyear3= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div[2]/div/div/span")).getText();
			if(currmonthyear3.equals(reqmonthyear3))
			{
				break;
			}
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div[2]/div/div/button[2]")).click();
			
		}
		
		List<WebElement> alldates3=driver.findElements(By.xpath("(//table)[2]//tbody/tr/td"));
		
		for(WebElement dates3:alldates3)
		{
			if(dates3.getText().equals(reqdate3))
			{
				dates3.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//textarea[@class='jobDescription']")).sendKeys("1) Workstation Management: Deploy, maintain, and troubleshoot company workstations while ensuring system security and \r\n"
				+ "updates. \r\n"
				+ "2) Network Administration: Manage and optimize network infrastructure, troubleshoot connectivity issues, and enforce \r\n"
				+ "security protocols. \r\n"
				+ "3) Software Licensing: Track, renew, and ensure compliance of all software licenses within the organization. \r\n"
				+ "4) IT Security & Operations: Implement security measures, manage data backups, and document IT processes for \r\n"
				+ "efficiency. ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		//education 
		
		driver.findElement(By.xpath("//button[normalize-space()='Add Education']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Graduate']")).click();
		driver.findElement(By.xpath("//input[@class='universityName']")).sendKeys("Rajasthan Technical University");
		WebElement course= driver.findElement(By.xpath("//select[@class='course']"));
		Select tar= new Select(course);
		tar.selectByVisibleText("B.Tech");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='specialization']")).sendKeys("Computer Science and Engneering");
		Thread.sleep(2000);
		WebElement fromyear = driver.findElement(By.xpath("//*[@id=\"educationList\"]/div/div[2]/select[1]"));
		Select drpfrom= new Select(fromyear);
		drpfrom.selectByVisibleText("2016");
		Thread.sleep(2000);
		Select drpto= new Select(driver.findElement(By.xpath("//select[@class='courseTo']")));
		drpto.selectByVisibleText("2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='percentage']")).sendKeys("72");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='saveEducation(this)']")).click();
		Thread.sleep(2000);
		
		//certification
		
		driver.findElement(By.xpath("//button[normalize-space()='Add Certification']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='certName']")).sendKeys("ISTQB Foundation level");
		driver.findElement(By.xpath("//input[@class='certID']")).sendKeys("CTFL-143197");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("Java");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("Maunal Testing");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("Jira");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("API Testing");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("Postman");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='skillInput']")).sendKeys("Black-box Testing");
		driver.findElement(By.xpath("//button[normalize-space()='Add Skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
		//driver.close();
	}


}
