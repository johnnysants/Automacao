package consultClientPF;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import keys.AccessKey;
import keys.SaveFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavePhonesPF {
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SavePepPF saveP = new SavePepPF();

	
	public void TextFilePhonesPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
	    
		try{
		
		Thread.sleep(2000);
		saveF.SaveTitlePhonePF(driver, element, gravarArq);
	    saveF.SaveCode4PF(driver, element, gravarArq);
	    saveF.SaveName5PF(driver, element, gravarArq);
	    saveF.SaveDocType2PF(driver, element, gravarArq);
	    saveF.SaveDocNumber2PF(driver, element, gravarArq);
	    saveF.SavePhoneTypePF(driver, element, gravarArq);
	    saveF.SaveGeoZonePF(driver, element, gravarArq);
	    saveF.SaveCountryCodePF(driver, element, gravarArq);
	    saveF.SaveAreaCodePF(driver, element, gravarArq);
	    saveF.SavePhoneNumberPF(driver, element, gravarArq);
	    saveF.SaveInternalPF(driver, element, gravarArq);
	    saveF.SavePreferencePF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    System.out.println("Informações de Telefonos Salvas com Sucesso");
	    
	    
	    //ACESSANDO A ROTA DE CONSULTA DE PEP
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnPEP()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadio2()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
	    saveP.TextFilePepPF(driver, element, arq, gravarArq);

		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close(); // Fecha a Janela 
	
		}

	}
	
	
	

}
