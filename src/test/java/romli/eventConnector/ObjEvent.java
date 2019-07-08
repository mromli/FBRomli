package romli.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ObjEvent {

	public ObjEvent(){
		String chromePath = "/usr/local/bin/chromedriver";
		System.setProperty("webdriver.chrome.driver",chromePath);
	}
	protected WebDriver driver = new ChromeDriver();


	public void openBrowser(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void clickObject(String objectName)throws NoSuchElementException{
		try {
			driver.findElement(By.xpath("//*[@value='"+objectName+"']")).click();
		}catch(NoSuchElementException a) {
			try {
				driver.findElement(By.xpath("//*[@id='"+objectName+"']")).click();
			}catch(NoSuchElementException b) {
				try {
					driver.findElement(By.xpath("(//label[(text()='"+objectName+"' or . ='"+objectName+"')])")).click();
				} catch(Exception e) {
					driver.findElement(By.xpath("(//button[(text()='"+objectName+"' or . ='"+objectName+"')])")).click();
				}

			}
		}
	}

	public void input(WebDriver driver, String value, String objectName){
		try {
			driver.findElement(By.xpath("//*[@value='"+objectName+"']")).sendKeys(value);
		}catch(NoSuchElementException a) {
			try {
				driver.findElement(By.xpath("//*[@id='"+objectName+"']")).sendKeys(value);
			}catch(Exception e) {
				driver.findElement(By.xpath("(//label[(text()='"+objectName+"' or . ='"+objectName+"')])")).sendKeys(value);
			}
		}
	}

	public void select(WebDriver driver, String value, String objectName) throws InterruptedException{
		try {
			new Select(driver.findElement(By.xpath("//*[@id='"+objectName+"']"))).deselectByVisibleText(value);
		}catch(NoSuchElementException e) {
			new Select(driver.findElement(By.xpath("//*[@value='"+objectName+"']"))).deselectByVisibleText(value);
		}
	}

}
