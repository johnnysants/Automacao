package access;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
	
	static Login Log = new Login();
	
	public static void openChrome() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "/home/Johnny/Documentos/T3T3S/Selenium/Drivers/chromedriver");//Executar no Chrome
		WebDriver driver = new ChromeDriver(); //Chrome
		
		driver.get("http://172.21.0.42:8080/QACoreProductBackoffice/sso#");
		driver.manage().window().maximize();//
		
		
		
		Log.insertLogin(driver);
		System.out.println("1");

		
	}
	
	
	
	
}
