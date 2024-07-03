package com.reusablepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepackage.Base_Class;

public class Reusable_Class extends Base_Class{
	
	public Actions action;
	public static Robot rob;
	public JavascriptExecutor js;
	public Alert alert;
	public Select select;
	public TakesScreenshot ts;
	
	public void onClick(WebElement element) {
		
		element.click();
		
	}
	
	public void sendKeys(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void mouseHover(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void doubleClick(WebElement element) {
		
		action.contextClick(element).build().perform();
	}
	
	public void dragAndDrop(WebElement source, WebElement dest) {
		action.dragAndDrop(source, dest);
	}
	
	public void clickAndHold(WebElement element) {
		action.clickAndHold(element);
	}
	
	public void keyBoardEnter() throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	public void keyBoardTab() throws AWTException {
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
	}
	public void keyBoardPageDown() throws AWTException {
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public void keyBoardPageUp() throws AWTException {
		rob.keyPress(KeyEvent.VK_PAGE_UP);
		rob.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	public void keyBoardDownArrow() throws AWTException {
		rob.keyPress(KeyEvent.VK_KP_UP);
		rob.keyPress(KeyEvent.VK_KP_UP);
	}
	
	public void scrollDown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);	
	}
	public void scrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}
	public void javaScriptClick(WebElement scr) {
		js.executeScript("argument[0].click()", scr);
	}
	
	public void popUpAccept() {
		alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	public void popUpDismiss() {
		alert.dismiss();
	}
	public void popUpSendKeys(String Text) {
		alert.sendKeys(Text);
	}
	
	public void dropDownValue(WebElement element, String Text) {
		select = new Select(element);
		select.selectByValue(Text);
	}
	public void dropDownIndex(WebElement element, int i) {
		select = new Select(element);
		select.selectByIndex(i);
	}
	
	public void takesScreenshot(String value) throws IOException {
		
		ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(value);
		FileUtils.copyFile(source, dest);
		
	}
	
	public void navigatewindows() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(1));
	}
	
	
	public String getText(WebElement element) {
		
		String text2 = element.getText();
		System.out.println(text2);
		
		
		return text2;
	}
	
	
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void WebdriverWait1(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(e));

	}
	
	
	
	
	
	
	
	

}
