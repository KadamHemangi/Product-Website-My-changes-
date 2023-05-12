package Test_Package_1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class View_Booked_Orders {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Hemangi Kadam\\Pictures\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://product.hicare.in:9999/");
		Thread.sleep(3000);
		//Launched successfully
		WebElement Account=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a"));
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
		WebElement Account1=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a"));
		Account1.click();
		WebElement View_Orders=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/div/ul/li[1]/a"));
		View_Orders.click();

	}

}
