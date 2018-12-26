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

public class SaveNegativeConditionsPJ {
	
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SaveCommunicationsChannelsPJ saveC = new SaveCommunicationsChannelsPJ();
	
	public void TextFileNegConditionsPJ(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		try{
		
		//ACESSANDO A ROTA DE CONSULTA DE CONDICIONES IMPOSITIVAS
		
	    element = driver.findElement(By.id(k.getBtnCancel()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnNegConditions()));
	    element.click();
		
	    
		Thread.sleep(2000);
		saveF.SaveTitleNegCondPJ(driver, element, gravarArq);
	    saveF.SaveCodePJ3(driver, element, gravarArq);
	    saveF.SaveNamePJ3(driver, element, gravarArq);
	    saveF.SaveDocTypePJ4(driver, element, gravarArq);
	    saveF.SaveDocNumberPJ4(driver, element, gravarArq);
	    saveF.SaveIVAPJ(driver, element, gravarArq);
	    saveF.SaveGrossIncomePJ(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	  
	    
	    
	    System.out.println("Informações de Condiciones Impositivas Salvas com Sucesso");
	    
	    saveC.TextFileComChannelsPJ(driver, element, arq, gravarArq);

		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}
	    
	    

	}

}
