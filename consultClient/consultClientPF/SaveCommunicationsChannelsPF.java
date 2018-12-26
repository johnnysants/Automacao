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

public class SaveCommunicationsChannelsPF {
	
	SaveFields saveF = new SaveFields();
	AccessKey k = new AccessKey();
	SavePhonesPF savePh = new SavePhonesPF();
	
	
	public void TextFileComChannelsPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		try{
			
		Thread.sleep(2000);
		saveF.SaveTitleComChannelsPF(driver, element, gravarArq);
	    saveF.SaveCode4PF(driver, element, gravarArq);
	    saveF.SaveName4PF(driver, element, gravarArq);
	    saveF.SaveDocType4PF(driver, element, gravarArq);
	    saveF.SaveDocNumber4PF(driver, element, gravarArq);
	    saveF.SaveTypeDigTrackPF(driver, element, gravarArq);
	    saveF.SaveEmailTypePF(driver, element, gravarArq);
	    saveF.SaveEmailPF(driver, element, gravarArq);
	    saveF.SaveNote1PF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	  
	    
	    System.out.println("Informações de Vías De Comunicación Salvas com Sucesso");
	    
	  //ACESSANDO A ROTA DE CONSULTA DE TELÉFONO
	    element = driver.findElement(By.id(k.getBtnCancel()));
	    element.click();
	    
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.id(k.getBtnPhones1()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadioPhone()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
	    savePh.TextFilePhonesPF(driver, element, arq, gravarArq);

		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}
	    
	    
	
	}

}
