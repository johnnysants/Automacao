package consultClientPJ;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import keys.AccessKey;
import keys.SaveFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavePhonesPJ {
	
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SaveDocumentsPJ saveDoc = new SaveDocumentsPJ();

	
	public void TextFilePhonesPJ(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		try{
		
		Thread.sleep(2000);
		saveF.SaveTitlePhonesPJ(driver, element, gravarArq);
	    saveF.SaveCodePJ2(driver, element, gravarArq);
	    saveF.SaveNamePJ(driver, element, gravarArq);
	    saveF.SaveDocTypePJ(driver, element, gravarArq);
	    saveF.SaveDocNumberAddPJ(driver, element, gravarArq);
	    saveF.SavePhoneTypePJ(driver, element, gravarArq);
	    saveF.SaveGeoZonePJ(driver, element, gravarArq);
	    saveF.SaveCountryCodePJ(driver, element, gravarArq);
	    saveF.SaveAreaCodePJ(driver, element, gravarArq);
	    saveF.SavePhoneNumberPJ(driver, element, gravarArq);
	    saveF.SaveInternalPJ(driver, element, gravarArq);
	    saveF.SavePreferencePJ(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	  
	    
	    
	    System.out.println("Informações de Telefonos Salvas com Sucesso");
	    
	    
	    //ACESSANDO A ROTA DE CONSULTA DE DOCUMENTOS
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnDocuments()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadio11()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
	    saveDoc.TextFileDocumentsPJ(driver, element, arq, gravarArq);

		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}

	}

}
