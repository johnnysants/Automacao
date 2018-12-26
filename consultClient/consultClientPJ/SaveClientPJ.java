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

public class SaveClientPJ {
	AccessKey k = new AccessKey();
	SaveAddressPJ saveAdd = new SaveAddressPJ();
	SaveFields saveF = new SaveFields();
	
	public void SaveTextFilePJ(WebDriver driver, WebElement element) throws InterruptedException, IOException {
		
		
		FileWriter arq = new FileWriter("/home/Johnny/Documentos/T3T3S/Selenium/Automação/ConsultaClientePJ.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    
	    saveF.SaveTitlePJ(driver, element, gravarArq);
	    saveF.SaveCodePJ(driver, element, gravarArq);
	    saveF.SaveNamePJ(driver, element, gravarArq);
	    saveF.SaveCategoryPJ(driver, element, gravarArq);
	    saveF.SaveSocialTypePJ(driver, element, gravarArq);
	    saveF.SaveNotePJ(driver, element, gravarArq);
	    saveF.SaveDocTypePJ(driver, element, gravarArq);
	    saveF.SaveDocNumberPJ(driver, element, gravarArq);
	    saveF.SaveConstDatePJ(driver, element,  gravarArq);
	    saveF.SaveBylawsDatePJ(driver, element, gravarArq);
	    saveF.SaveCapitalPJ(driver, element, gravarArq);
	    saveF.SaveNatioalityPJ(driver, element, gravarArq);
	    saveF.SaveCountryConstPJ(driver, element, gravarArq);
	    saveF.SaveCountryActivPJ(driver, element, gravarArq);
	    saveF.SavePlaceActivPJ(driver, element, gravarArq);
	    saveF.SaveBcraActivPJ(driver, element, gravarArq);
	    saveF.SaveNoteActivPJ(driver, element, gravarArq);
	    saveF.SaveSectorBcraPJ(driver, element, gravarArq);
	    saveF.SaveResidencePJ(driver, element, gravarArq);
	    saveF.SaveStartDatePJ(driver, element, gravarArq);
	    saveF.SaveEndDatePJ(driver, element,  gravarArq);
	    saveF.SavePercentagePJ(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    //arq.close(); // Fecha o arquivo de texto
	    
	    System.out.println("Informações Salvas em ConsultaClientePJ com Sucesso");
	    
	    
	  //ACESSANDO A ROTA DE CONSULTA DE DOMICILIOS
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnAddress()));
	    System.out.println();
	    element.click();
	    
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadio1()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
		
		saveAdd.TextFileAddressPJ(driver, element, arq, gravarArq );
		
		
		
	}


}
