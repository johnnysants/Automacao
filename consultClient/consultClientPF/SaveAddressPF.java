package consultClientPF;

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

public class SaveAddressPF {
	
	SaveCommunicationsChannelsPF saveC = new SaveCommunicationsChannelsPF();
	AccessKey k = new AccessKey();
	SelectFields sField = new SelectFields();
	SaveFields saveF = new SaveFields();

	
	public void TextFileAddressPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
	    try{
	    	
	    
		Thread.sleep(2000);
		saveF.SaveTitleAddressPF(driver, element, gravarArq);
	    saveF.SaveCode3PF(driver, element, gravarArq);
	    saveF.SaveName3PF(driver, element, gravarArq);
	    saveF.SaveDocType3PF(driver, element, gravarArq);
	    saveF.SaveDocNumber3PF(driver, element, gravarArq);
	    saveF.SaveDateFromPF(driver, element, gravarArq);
	    saveF.SaveDateUntilPF(driver, element, gravarArq);
	    saveF.SaveTypeAddressPF(driver, element, gravarArq);
	    saveF.SaveCountryPF(driver, element, gravarArq);
	    saveF.SaveProvincePF(driver, element, gravarArq);
	    saveF.SaveCityPF(driver, element, gravarArq);
	    saveF.SaveLocationPF(driver, element, gravarArq);
	    saveF.SavePostCodePF(driver, element, gravarArq);
	    saveF.SaveNeighborhoodPF(driver, element, gravarArq);
	    saveF.SaveTypeStreetPF(driver, element, gravarArq);
	    saveF.SaveStreetRoutePF(driver, element,  gravarArq);
	    saveF.SaveNumberKMPF(driver, element, gravarArq);
	    saveF.SaveFloorPF(driver, element, gravarArq);
	    saveF.SaveDepartmentPF(driver, element,  gravarArq);
	    saveF.SaveNotePF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    System.out.println("Informações de Domicilios Salvas com Sucesso");
	    
		  //ACESSANDO A ROTA DE CONSULTA DE VIAS DE COMUNICACION
	    element = driver.findElement(By.id(k.getBtnCancel()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.id(k.getBtnComChannels()));
	    element.click();
	    
	    
	    Thread.sleep(1000);
	    sField.TypeDigitalTrack(driver);//Seleciona opção no combobox
	    
	    element = driver.findElement(By.id(k.getBtnSelect1()));
	    element.click();
	    
	    Thread.sleep(1000);
		element = driver.findElement(By.name(k.getBtnRadio2()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult1()));
	    element.click();
	    
		
	    saveC.TextFileComChannelsPF(driver, element, arq, gravarArq);
	    
		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
		}

	
	}

}
