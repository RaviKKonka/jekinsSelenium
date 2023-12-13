	package Selenium_Jenkins;
	
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class sample_Demo {
	
		@Test
		public void sampleMethod() {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			String title = driver.getTitle();
			System.out.println("title >> " + title);
			Assert.assertEquals(title, "Google");
			driver.quit();
		}
	
	}
