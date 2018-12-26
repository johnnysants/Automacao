package access;


import java.io.IOException;

import javax.swing.JOptionPane;

import keys.AccessKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import consultCheckingAccount.SearchAccount;
import consultClientPJ.SearchClient;

public class Login {
	
	AccessKey k = new AccessKey();
	SearchClient search = new SearchClient();
	SearchAccount account = new SearchAccount();
	
	public void insertLogin(WebDriver driver ) throws InterruptedException, IOException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(k.getBtnContinue()))); 
		
		
		element = driver.findElement(By.id(k.getUserName()));
		element.sendKeys("JDOSSANTOS");
		
		element = driver.findElement(By.id(k.getPassword()));
		element.sendKeys("1234");
		
		element = driver.findElement(By.id(k.getBtnContinue()));
		element.click();
		
		boolean x = false;
		
		
		
		while (x == false){
			Thread.sleep(2000);
			String resp = JOptionPane.showInputDialog(null, "1 - Consulta Clientes \n" + "2 - Consulta Contas");
			int opt = Integer.parseInt(resp);
			
			if(opt == 1){
				x = true;
				search.Search(driver, element);
				
			}
			else if(opt == 2){
				x = true;
				account.Account(driver, element);
				
			}
			else{
				x = false;
				JOptionPane.showMessageDialog(null, "Insira apenas os numeros das operações");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
