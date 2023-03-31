package stctv;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class stctv {

	public WebDriver driver;

	
	// hard coded

	SoftAssert softassertProcess = new SoftAssert();

	@BeforeTest()

	public void this_is_before_test() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(https:\\subscribe.jawwy.tv/jo-en);

		driver.manage().window().maximize();

	}

	@Test()
	public void Test_Select_lite() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
			driver.findElement(By.xpath(\\*[@id="لايت-selection"])).click();

			String the_lite_price = driver.findElement(By.xpath(\\*[@id="order-tier-price"])).getText();

			String[] the_updated_lite_price = the_lite_price.split("USD");

			String The_Final_lite_price_in_string = the_updated_lite_price[0].trim();

			Double final_Price = Double.parseDouble(The_Final_lite_price_in_string);
			
			
           string total_price =driver.findElement(By.xpath(\\*[@id="order-total-price"]/b)).getText();
           Double summation_price = Double.parseDouble(total_price);
			
			
			
          softassertProcess.assertEquals(final_Price,summation_price);

			
			

	@Test()

	public void Select_Standerd_pakge() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
		driver.findElement(By.xpath(\\*[@id="الأساسية-selection"])).click();

		String the_basic_price = driver.findElement(By.xpath(\\*[@id="order-tier-price"]])).getText();

		String[] the_updated_basic_price = the_basic_price.split("USD");

		String The_Final_basic_price_in_string = the_updated_basic_price[0].trim();

		Double final_Price_basic = Double.parseDouble(The_Final_basic_price_in_string);
		
		
       string total_price_basic =driver.findElement(By.xpath(\\*[@id="order-total-price"]/b)).getText();
       Double summation_price_basic = Double.parseDouble(total_price_basic);
		
		
		
      softassertProcess.assertEquals(final_Price_basic,summation_price_basic);
		
	}

		
//
		softassertProcess.assertAll();

	}

}


