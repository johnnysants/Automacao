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

public class SaveAddressPJ {	
	
	SavePhonesPJ savePh = new SavePhonesPJ();
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	
	public void TextFileAddressPJ(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		
	    try {
		Thread.sleep(2000);
		saveF.SaveTitleAddressPJ(driver, element, gravarArq);
	    saveF.SaveCodePJ(driver, element, gravarArq);
	    saveF.SaveNamePJ(driver, element, gravarArq);
	    saveF.SaveDocTypePJ(driver, element, gravarArq);
	    saveF.SaveDocNumberAddPJ(driver, element, gravarArq);
	    saveF.SaveDateFromPJ(driver, element, gravarArq);
	    saveF.SaveDateUntilPJ(driver, element, gravarArq);
	    saveF.SaveTypeResidPJ(driver, element, gravarArq);
	    saveF.SaveCountryPJ(driver, element, gravarArq);
	    saveF.SaveProvincePJ(driver, element, gravarArq);
	    saveF.SaveCityPJ(driver, element, gravarArq);
	    saveF.SaveLocationPJ(driver, element, gravarArq);
	    saveF.SavePostCodePJ(driver, element, gravarArq);
	    saveF.SaveNeighborhoodPJ(driver, element, gravarArq);
	    saveF.SaveTypeStreetPJ(driver, element, gravarArq);
	    saveF.SaveStreetRoutePJ(driver, element,  gravarArq);
	    saveF.SaveHouseNumberPJ(driver, element, gravarArq);
	    saveF.SaveFloorPJ(driver, element, gravarArq);
	    saveF.SaveDepartmentPJ(driver, element,  gravarArq);
	    saveF.SaveNoteAddressPJ(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    System.out.println("Informações de Domicilios Salvas com Sucesso");
	    
		  //ACESSANDO A ROTA DE CONSULTA DE TELEFONOS
	    element = driver.findElement(By.id(k.getBtnCancel()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnPhones()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadioPhone()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
		
		savePh.TextFilePhonesPJ(driver, element, arq, gravarArq);
		
	    } catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();

		}
	}
	
	 
}
