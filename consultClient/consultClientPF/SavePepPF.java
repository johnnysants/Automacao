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

public class SavePepPF {
	
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SaveClassificationsPF saveCl = new SaveClassificationsPF();

	
	public void TextFilePepPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
	    try{
	    	
		Thread.sleep(2000);
		saveF.SaveTitlePEPPF(driver, element, gravarArq);
	    saveF.SaveCode5PF(driver, element, gravarArq);
	    saveF.SaveName6PF(driver, element, gravarArq);
	    saveF.SaveDocType5PF(driver, element, gravarArq);
	    saveF.SaveDocNumber5PF(driver, element, gravarArq);
	    saveF.SaveClientPEPPF(driver, element, gravarArq);
	    saveF.SaveDateSwornPF(driver, element, gravarArq);
	    saveF.SavePositionPF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    System.out.println("Informações de PEP Salvas com Sucesso");
	    
	    
	    //ACESSANDO A ROTA DE CONSULTA DE CLASIFICACIONES
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnClassifications()));
	    element.click();
	    
	    
	    saveCl.TextFileClassfPF(driver, element, arq, gravarArq);

		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}

	}

}
