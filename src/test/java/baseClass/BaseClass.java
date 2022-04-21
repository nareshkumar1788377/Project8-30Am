package baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		     driver=new EdgeDriver();
			
		}else if(browsername.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			 driver=new OperaDriver();
			
		}else if(browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		return driver;
			
	}
	
	
	public static void chromeBrowser() {
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void FirefoxBrowser() {
	WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	public static void edgeBrowser() {
	WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	public static void operaBrowser() {
	WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
	}
	
	public static void ieBrowser() {
	WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	public static void implicitlyWait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		
	}
	
	public static void urlLaunch (String url)  {
		driver.get(url);

	}
	
	public static String  geturl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static  void sendkeys(WebElement e, String value) {
		e.sendKeys(value);

	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	public static String getAttribute(WebElement e) {
	 String attribute = e.getAttribute("value");
	 return attribute;
	}
	
	public static String innerText(WebElement e) {
		String attribute = e.getAttribute("innerText");
		return attribute;
		
	}
	
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();

	}
	
    public static  void toStringUrl(String url) {
    	driver.navigate().to(url);
	}
    
    public static void back() {
		driver.navigate().back();

	}
    
    public static void forward() {
		driver.navigate().forward();

	}
    
    public static  void refresh() {
		driver.navigate().refresh();
	}
    
    public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
    
    public static void alertDismiss() {
  		Alert alert = driver.switchTo().alert();
  		alert.dismiss();
  	}
  	
	public static  void selectByIndex(WebElement e, int i) {
		Select s=new Select(e); 
		s.selectByIndex(i);
	}
	
	public static void selectbyString(WebElement e, String value) {
		Select s=new Select(e);
		s.selectByValue("value");
				

	}
	
    public static  void copy() throws AWTException {
    	
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_C);
    	
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_C);
}
	
    
 public static  void cut() throws AWTException {
    	
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_X);
    	
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_X);
}
	
    
   public static  void paste() throws AWTException {
    	
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_V);
    	
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_V);
}
   
   public static  void Tab() throws AWTException {
	   
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_TAB);
	   r.keyRelease(KeyEvent.VK_TAB);
	   
	  
}
   
  public static void enter(WebElement e) throws AWTException {
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	 
}
   
     
   public static void rightClick(WebElement e) {
	   
	   Actions a=new Actions(driver);
	   a.contextClick(e).perform();	

}

   
   public static  void doubleClick(WebElement e) {
	   
	   Actions a=new Actions(driver);
	   a.doubleClick(e).perform();
}
   
   
   
   
   
   
   

}
