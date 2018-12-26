package consultClientPJ;

import java.io.IOException;

import javax.swing.JOptionPane;

import keys.AccessKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import consultClientPF.SaveClientPF;

public class SearchClient {
	
	AccessKey k = new AccessKey();
	SaveClientPJ savePJ = new SaveClientPJ();
	SaveClientPF savePF = new SaveClientPF();
	
	
	public void Search(WebDriver driver, WebElement element) throws InterruptedException, IOException {
		
		
		Thread.sleep(4000);
		element = driver.findElement(By.id(k.getMenuClient()));
		element.click();
		
		element = driver.findElement(By.id(k.getMenuConsult()));
		element.click();
		
		
	    Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.id(k.getMenuConsult1()));
	    WebElement sub_menu = driver.findElement(By.id(k.getMenuConsult11()));//TESTAR PRA VER SE É POSSIVEL REDUZIR CÓDIGO
	    action.moveToElement(menu).moveToElement(sub_menu).click().build().perform(); //Acessa a rota de menu HOVER
	    
	    

		    Thread.sleep(3000);
		    element = driver.findElement(By.id(k.getClientCode()));
			element.click();
			element.sendKeys("764");
			
			Thread.sleep(1000);
			element = driver.findElement(By.id(k.getOk()));
			element.click();
			
			
			Thread.sleep(3000);
			element = driver.findElement(By.name(k.getBtnRadio()));
			element.click();
			
			element = driver.findElement(By.id(k.getBtnSelect()));
			element.click();
			Thread.sleep(2000);
			
			try {
				savePF.SaveTextFilePF(driver, element);
			}
			catch (Exception e) {
				savePJ.SaveTextFilePJ(driver, element);
			}
		
		
		
		
		
		
		
		
		
	}  

}
