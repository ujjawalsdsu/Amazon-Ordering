
/*
 * 1) Login to the application
2) Selecting a product category from Top Menu
3) Selecting a product and adding it to the cart
4) Go to checkout page to provide personal details and complete the order
5) Verify details from final Confirmation page
*/

package order;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Order_Verification {


	private static String search="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input";
	private static String nexus="/html/body/div[1]/div[1]/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[3]/div/div/div/div[2]/div[2]/a/h2";
	private static String addtocart ="//input[@id='add-to-cart-button']";
	//private static String warranty="/html/body/div[2]/div/div[1]/div[3]/div[1]/div/div[3]/div[1]/div/label/input";
	private static String proceed="/html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/div[4]/div/div/div/span[2]/span/a";
	private static String email="/html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[1]/input";
	private static String pwd="/html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[2]/input";
	private static String password="ujjawalsharma";
	private static String user="Ujjawal Prakash Sharma";
	private static String username="html/body/div[5]/div[2]/div[3]/div[1]/div/div[1]/div/form/div[1]/div[1]/div/input";
	private static String addressline="//input[@id='enterAddressAddressLine1']";
	private static String address="6545 Montezuma road";
	private static String city="//input[@id='enterAddressCity']";
	private static String CITY ="San Diego";
	private static String state="//input[@id='enterAddressStateOrRegion']";
	private static String STATE="California";
	/*private static String country="//input[@id='enterAddressCountryCode']";
	private static String COUNTRY="United States";*/
	private static String phone="//input[@id='enterAddressPhoneNumber']";
	private static String Phone="6192190000";
	private static String zipcode="//input[@id='enterAddressPostalCode']";
	private static String PINCODE="92115";
		
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/157-4164189-6961002");
		Reporter.log("Amazon URL opened");
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//enter username
		driver.findElement(By.xpath(search)).sendKeys("Google Nexus 5");
		Reporter.log("Google Nexus 5 entered in the search box");
		Thread.sleep(2000);
		driver.findElement(By.xpath(search)).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
			
		//NEED TO CHANGE THIS FROM XPATH TO SEARCH BY.NAME
		driver.findElement(By.xpath(nexus)).click();
		Reporter.log("Amazon URL opened");
		Thread.sleep(5000);
		
		if(driver.getTitle().contains("Amazon.com: LG Nexus 5 D820 Unlocked Cellphone, 16GB, Black: Cell Phones & Accessories"))
		    //Pass
		    System.out.println("You are on the right page!");
		else
		    //Fail
		    System.out.println("Sorry mate wrong page!");
			Reporter.log("correct page!");
			Thread.sleep(5000);
			
		driver.findElement(By.xpath(addtocart)).click();
		Reporter.log("Item added to the cart");
		Thread.sleep(5000);
		//driver.findElement(By.xpath(warranty)).click();
		//Reporter.log("Warranty card applied successfully");
		Thread.sleep(1000);
		driver.findElement(By.xpath(proceed)).click();
		Reporter.log("Proceed with the transaction");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(email)).click();
		Reporter.log("sign-in");
		Thread.sleep(1000);
		driver.findElement(By.xpath(email)).sendKeys("ujjawalsharma.taurus@gmail.com");
		Reporter.log("User ID entered succesfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath(email)).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(pwd)).sendKeys(password);
		Thread.sleep(2000);
		Reporter.log("Password entered succesfully");
		driver.findElement(By.xpath(pwd)).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		
		//Adding Shipping address information
		driver.findElement(By.xpath(username)).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.xpath(addressline)).sendKeys(address);
		Thread.sleep(2000);
		driver.findElement(By.xpath(city)).sendKeys(CITY);
		Thread.sleep(2000);
		driver.findElement(By.xpath(state)).sendKeys(STATE);
		Thread.sleep(2000);
		driver.findElement(By.xpath(zipcode)).sendKeys(PINCODE);
		Thread.sleep(2000);
		driver.findElement(By.xpath(phone)).sendKeys(Phone);
		Thread.sleep(2000);
		
		}

	}

