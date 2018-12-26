package consultCheckingAccount;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import keys.AccessKey;
import keys.SaveFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import consultClientPJ.SaveAddressPJ;

public class SaveCheckingAccount {
	
	AccessKey k = new AccessKey();
	SaveAddressPJ saveAdd = new SaveAddressPJ();
	SaveFields saveF = new SaveFields();
	
	public void SaveTextFileCheckAccount(WebDriver driver, WebElement element) throws InterruptedException, IOException {
		
		
		FileWriter arq = new FileWriter("/home/Johnny/Documentos/T3T3S/Selenium/Automação/ContaCorrente.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    Thread.sleep(1500);
	    saveF.SaveTitleCheckAccount(driver, element, gravarArq);
	    saveF.SaveProduct1(driver, element, gravarArq);
	    saveF.SaveSubProduct1(driver, element, gravarArq);
	    saveF.SaveBranchOfc1(driver, element, gravarArq);
	    saveF.SaveCurrency1(driver, element, gravarArq);
	    saveF.SaveAccount(driver, element, gravarArq);
	    saveF.SaveAccountItem(driver, element, gravarArq);
	    saveF.SaveShoAccItem(driver, element, gravarArq);
	    saveF.SaveAlias(driver, element,  gravarArq);
	    saveF.SaveInsuranceCompany(driver, element, gravarArq);
	    saveF.SaveReasonOpen(driver, element, gravarArq);
	    saveF.SaveIVA(driver, element, gravarArq);
	    saveF.SaveSignatureUse(driver, element, gravarArq);
	    saveF.SaveBcraActivity(driver, element, gravarArq);
	    saveF.SaveExemptImmobilization(driver, element, gravarArq);
	    saveF.SaveCodeActivity(driver, element, gravarArq);
	    saveF.SaveIntersuccursalSupport(driver, element, gravarArq);
	    saveF.SaveAccountSector(driver, element, gravarArq);
	    saveF.SaveAllowChecks(driver, element, gravarArq);
	    saveF.SaveWaySendExtract(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    arq.close();
	    
	    System.out.println("Informações Salvas em ContaCorrente.txt com Sucesso");
	    
	    driver.close();
	    
		
	}

}
