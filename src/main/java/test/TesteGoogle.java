package test;

import core.DriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static core.DriverFactory.*;

public class TesteGoogle {

	@Before
	public void inicializa(){
		getDriver();
	}
	
	@After
	public void finaliza(){
		killDriver();
	}
	
	@Test
	public void teste() {
//		System.setProperty("webdriver.gecko.driver", "/Users/wcaquino/Downloads/geckodriver");
//		System.setProperty("webdriver.chrome.driver", "/Users/wcaquino/Downloads/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		getDriver().get("http://www.google.com");
		Assert.assertEquals("Google", getDriver().getTitle());
	}

}
