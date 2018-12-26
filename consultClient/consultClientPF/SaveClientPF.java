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

public class SaveClientPF {
	
	SaveLaborDataPF saveL = new SaveLaborDataPF();
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	
	public void SaveTextFilePF(WebDriver driver, WebElement element) throws InterruptedException, IOException {
		
		
		FileWriter arq = new FileWriter("/home/Johnny/Documentos/T3T3S/Selenium/Automação/ConsultaClientePF.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    
	    	
	    saveF.SaveTitlePF(driver, element, gravarArq);
	    saveF.SaveCodePF(driver, element, gravarArq);
	    saveF.SaveNamePF(driver, element, gravarArq);
	    saveF.SaveCategoryPF(driver, element, gravarArq);
	    saveF.SaveDocTypePF(driver, element, gravarArq);
	    saveF.SaveDocNumberPF(driver, element, gravarArq);
	    saveF.SaveGenderPF(driver, element, gravarArq);
	    saveF.SaveDateBirthPF(driver, element, gravarArq);
	    saveF.SaveCountryBirthPF(driver, element, gravarArq);
	    saveF.SavePlaceBirthPF(driver, element, gravarArq);
	    saveF.SaveNatioalityPF(driver, element, gravarArq);
	    saveF.SavePlaceResidPF(driver, element, gravarArq);
	    saveF.SaveTypeResidPF(driver, element, gravarArq);
	    saveF.SaveResideFromPF(driver, element, gravarArq);
	    saveF.SaveCapacityPF(driver, element, gravarArq);
	    saveF.SaveCivilStatusPF(driver, element,  gravarArq);
	    saveF.SaveEducationPF(driver, element, gravarArq);
	    saveF.SaveJobPF(driver, element, gravarArq);
	    saveF.SaveProfPF(driver, element, gravarArq);
	    saveF.SaveBcraActivPF(driver, element, gravarArq);
	    saveF.SaveSectorBcraPF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);

	    
	    
	    
	    System.out.println("Informações Do Cliente PF Salvas com Sucesso");
	    
	    //ACESSANDO A ROTA DE CONSULTA DE TELEFONOS
	    element = driver.findElement(By.id(k.getBtnLaborData()));
	    element.click();
	    
	    Thread.sleep(2000);
	    element = driver.findElement(By.name(k.getBtnRadio()));
	    element.click();
	    
	    element = driver.findElement(By.id(k.getBtnConsult()));
	    element.click();
	    
		
		saveL.TextFileLaborDataPF(driver, element, arq, gravarArq);
		
		
	}
}
