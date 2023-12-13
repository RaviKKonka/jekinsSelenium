	package Selenium_Jenkins;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	
	public class sample_Demo {
	
		@Parameters("Browser")
		@Test
		public void sampleMethod(String browserName) {
	
			System.out.println("browserName >> " + browserName);
			WebDriver driver = null;
			if (browserName.contains("Chrome"))
				driver = new ChromeDriver();
			else if(browserName.contains("Edge"))
				driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			String title = driver.getTitle();
			System.out.println("title >> " + title);
			Assert.assertEquals(title, "Google");
			driver.quit();
		}
	
	}
