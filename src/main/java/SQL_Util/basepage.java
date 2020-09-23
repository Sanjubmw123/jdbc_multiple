package SQL_Util;

import java.io.File;
import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	WebDriver driver;
	public basepage(WebDriver driver) {
		this.driver=driver;
	}
		 		  
		  public  static void dropDown(WebElement string,String visibleText) {
				Select sel=new Select (string);
				sel.selectByVisibleText(visibleText);
				
			}
					
			

			public static int randomNumGenerator1(String string, String visibleText) {
				Random rnd =new Random();
				int randomNum = rnd.nextInt(999);
				return randomNum ;}
			
			
				public static void waitforElement(WebDriver driver, int timeInSeconds , By locator) {
				  WebDriverWait wait=new WebDriverWait(driver, timeInSeconds);
				  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			}
			
				/*public void screenShot(WebDriver driver, String fileWithPath) throws Exception {
					// Convert web driver object to TakeScreenshot
					TakesScreenshot scrShot = ((TakesScreenshot) driver);
					// Call getScreenshotAs method to create image file
					File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);					
					// Move image file to new destination
					File DestFile = new File(fileWithPath);
					// Copy file at destination
					FileUtils.copyFile(SrcFile, DestFile);*/
				}
				
			
				
			

			


