package Test_Package_1;
import java.util.Scanner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Hemangi Kadam\\Pictures\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://product.hicare.in/");
		Thread.sleep(3000);
		//Launched successfully
		WebElement Account=driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div/div[1]/div[3]/ul/li[2]/div/a"));
		Account.click();
		Thread.sleep(3000);
		//Login Process
		WebElement Mobile_number=driver.findElement(By.id("user_mobile"));
		Mobile_number.click();
		WebElement Mobile_number_input=driver.findElement(By.id("user_mobile"));
		Mobile_number_input.sendKeys("9833425754");
		WebElement Send_OTP=driver.findElement(By.id("sendotp"));
		Send_OTP.click();
		WebElement Enter_OTP=driver.findElement(By.id("user_otp"));
		Enter_OTP.click();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP");
		String otp=sc.nextLine();
		sc.close();
		WebElement otp1=driver.findElement((By.id("user_otp")));
		otp1.sendKeys(otp);
		Thread.sleep(2000);
		System.out.println("OTP entered");
		WebElement Login=driver.findElement(By.id("btn_login"));
		Login.click();
		Thread.sleep(3000);
		System.out.println("Login scenario Passed");
		//Select Product
		//WebElement edit=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[3]/div/div[1]/div[1]/ul/li/div/a/i"));
		//edit.click();
		//Thread.sleep(1000);
		//WebElement pincode=driver.findElement(By.id("citypincode"));
		//pincode.sendKeys("400024");
		//driver.navigate().refresh();
		//WebElement ok1=driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[1]/ul/li/div/div/ul/li/div/div[2]/a"));
		//ok1.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		Thread.sleep(5000);
		WebElement AutoMos=driver.findElement(By.xpath("//*[@id=\"page\"]/main/div[4]/div[2]/div[3]/div/a"));
		AutoMos.click();
		System.out.println("Product selection done");
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"page\"]/main/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/a"));
		addtocart.click();
		WebElement cart=driver.findElement(By.id("cart-count"));
		cart.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);

		//WebElement proceed2=driver.findElement(By.xpath("//*[@id=\"btn-proceed-to-cart\"]"));
		//proceed2.click();
		//WebElement proceed3=driver.findElement(By.id("btn-proceed-to-cart"));
		//WebElement proceed3=driver.findElement(By.className("btn_1 full-width cart"));
		WebElement proceed3=driver.findElement(By.cssSelector("#btn-proceed-to-cart"));
		proceed3.click();
		System.out.println("Proceeded to checkout");
		Thread.sleep(2000);
		//Add delivery address
		WebElement Delivery_addr=driver.findElement(By.xpath("//*[@id=\"demo-htmlselect\"]/div/span"));
		Delivery_addr.click();
		WebElement New_Delivery_addr=driver.findElement(By.xpath("//*[@id=\"demo-htmlselect\"]/ul/li[1]/a"));
		New_Delivery_addr.click();
		Thread.sleep(2000);
		WebElement Name=driver.findElement(By.id("ship_pay_fname"));
		Name.sendKeys("Hemangi Kadam");
		WebElement Mobile=driver.findElement(By.id("ship_pay_mobile"));
		Mobile.sendKeys("9833425754");
		WebElement Email=driver.findElement(By.id("ship_pay_email"));
		Email.sendKeys("hemangi.kadam@hicare.in");
		WebElement Flat=driver.findElement(By.id("ship_pay_flat"));
		Flat.sendKeys("121");
		WebElement Building=driver.findElement(By.id("ship_pay_building"));
		Building.sendKeys("Building test");
		js.executeScript("window.scrollBy(0,200)", "");
		WebElement Street=driver.findElement(By.id("ship_pay_street"));
		Street.sendKeys("street test");
		WebElement Locality=driver.findElement(By.id("ship_pay_locality"));
		Locality.sendKeys("locality test");
		WebElement Landmark=driver.findElement(By.id("ship_pay_landmark"));
		Landmark.sendKeys("Landmark test");
		WebElement Add_address=driver.findElement(By.id("btnSaveAddress"));
		Add_address.click();


	}

}
