package consultCheckingAccount;

import java.io.IOException;


import keys.AccessKey;
import keys.SelectFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SearchAccount {
	
	AccessKey k = new AccessKey();
	SelectFields sField = new SelectFields();
	SaveCheckingAccount saveA = new SaveCheckingAccount();
	
	public void Account(WebDriver driver, WebElement element)throws IOException, InterruptedException{
		
		Thread.sleep(2000);
		element = driver.findElement(By.id(k.getMenuOperations()));
		element.click();
		
		element = driver.findElement(By.id(k.getMenuPassive()));
		element.click();
		
		
	    Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.id(k.getMenuPassive1()));
	    WebElement sub_menu = driver.findElement(By.id(k.getMenuAccSight()));//TESTAR PRA VER SE É POSSIVEL REDUZIR CÓDIGO
	    WebElement sub_menu1 = driver.findElement(By.id(k.getMenuAccMaintenace()));
	    WebElement sub_menu2 = driver.findElement(By.id(k.getMenuModifyAcc()));
	    action.moveToElement(menu).moveToElement(sub_menu).moveToElement(sub_menu1).moveToElement(sub_menu2).click().build().perform(); //Acessa a rota de menu HOVER
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getMenuOperations()));
		element.click();
	    
	    /****COMBOBOX****/
	    sField.Product(driver);
	    Thread.sleep(500);
	    sField.SubProduct(driver);
	    Thread.sleep(500);
	    sField.BranchOfc(driver);
	    Thread.sleep(500);
	    sField.Currency(driver);
	   /***********************/
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getAccoutFrom()));
		element.sendKeys("1686");
		
		element = driver.findElement(By.id(k.getBtnOK()));
		element.click();
		
		Thread.sleep(1000);
		element = driver.findElement(By.name(k.getBtnRadio()));
		element.click();
		
		element = driver.findElement(By.id(k.getBtnConsult2()));
		element.click();
		
		saveA.SaveTextFileCheckAccount(driver, element);
		
		
	}

}
