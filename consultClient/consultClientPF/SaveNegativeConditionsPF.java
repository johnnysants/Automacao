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

public class SaveNegativeConditionsPF {
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SaveAddressPF saveAdd = new SaveAddressPF();
	
	public void TextFileNegConditionsPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		try {
			
		Thread.sleep(2000);
		
		saveF.SaveTitleNegCondPF(driver, element, gravarArq);
	    saveF.SaveCode1PF(driver, element, gravarArq);
	    saveF.SaveName1PF(driver, element, gravarArq);
	    saveF.SaveDocType1PF(driver, element, gravarArq);
	    saveF.SaveDocNumber1PF(driver, element, gravarArq);
	    saveF.SaveIVAPF(driver, element, gravarArq);
	    saveF.SaveGrossIncPF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	  
	    
	    
	    System.out.println("Informações de Condiciones Impositivas Salvas com Sucesso");
	    
	    //ACESSANDO A ROTA DE CONSULTA DE DOMICILIOS
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.id(k.getBtnAddress()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadio1()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
	    saveAdd.TextFileAddressPF(driver, element, arq, gravarArq);
	    
		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}
	    
	}

}
