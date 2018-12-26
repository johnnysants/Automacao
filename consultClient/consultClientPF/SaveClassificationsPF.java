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

public class SaveClassificationsPF {
	
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SaveDocumentsPF saveDoc = new SaveDocumentsPF();

	
	public void TextFileClassfPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
	    try{
	    	
		Thread.sleep(2000);
		saveF.SaveTitleClassfPF(driver, element, gravarArq);
	    saveF.SaveCode6PF(driver, element, gravarArq);
	    saveF.SaveName7PF(driver, element, gravarArq);
	    saveF.SaveDocType2PF(driver, element, gravarArq);
	    saveF.SaveDocNumber6PF(driver, element, gravarArq);
	    saveF.SaveClassifBankClientPF(driver, element, gravarArq);
	    saveF.SaveCustomerSegPF(driver, element, gravarArq);
	    saveF.SaveCustomerCentralBankClPF(driver, element, gravarArq);
	    saveF.SaveCutomerCentralBankDatePF(driver, element, gravarArq);
	    saveF.SaveClassifSystemsPF(driver, element, gravarArq);
	    saveF.SaveIntervenungUserPF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    System.out.println("Informações de Clasificaciones Salvas com Sucesso");
	    
	    
	    //ACESSANDO A ROTA DE CONSULTA DE PEP
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnDocuments()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.name(k.getBtnRadio11()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
	    
	    saveDoc.TextFileDocPF(driver, element, arq, gravarArq);
	    
		} catch (Exception e) {
		// TODO: handle exception
	    JOptionPane.showMessageDialog(null, "Erro na Operação");
	    arq.close(); // Fecha o arquivo de texto
	    driver.close();

		}
	    
	    
	}

}
