package consultClientPJ;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import keys.AccessKey;
import keys.SaveFields;
import keys.SelectFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaveCommunicationsChannelsPJ {
	
	AccessKey k = new AccessKey();
	SelectFields sField = new SelectFields();
	SaveFields saveF = new SaveFields();
	
	public void TextFileComChannelsPJ(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		try {
		
		//ACESSANDO A ROTA DE CONSULTA DE VÍAS DE COMUNICACIÓN
		
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnComChannels()));
	    element.click();
	    
	    Thread.sleep(1000);
		sField.TypeDigitalTrack(driver);//Seleciona opção no combobox
		
		element = driver.findElement(By.id(k.getBtnSelect1()));
	    element.click();
	    
		Thread.sleep(2000);
		element = driver.findElement(By.name(k.getBtnRadio2()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult1()));
	    element.click();
		
		Thread.sleep(2000);
		saveF.SaveTitleComChannelsPJ(driver, element, gravarArq);
	    saveF.SaveCodePJ2(driver, element, gravarArq);
	    saveF.SaveNamePJ(driver, element, gravarArq);
	    saveF.SaveDocTypePJ5(driver, element, gravarArq);
	    saveF.SaveDocNumberPJ3(driver, element, gravarArq);
	    saveF.SaveTypeDigitalTrackPJ(driver, element, gravarArq);
	    saveF.SaveEmailTypePJ(driver, element, gravarArq);
	    saveF.SaveEmailPJ(driver, element, gravarArq);
	    saveF.SaveNote2PJ(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	  
	    arq.close(); // Fecha o arquivo de texto
	    
	    
	    System.out.println("Informações de Vías De Comunicación Salvas com Sucesso");
	    JOptionPane.showMessageDialog(null, "Todas Infomações Salvas Com Sucesso");
	    
		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();

		}

	    
	    
	}

}
