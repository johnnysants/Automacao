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

public class SaveLaborDataPF {
	
	SaveNegativeConditionsPF saveN = new SaveNegativeConditionsPF();
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();

	
	public void TextFileLaborDataPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		try{
	    
		Thread.sleep(2000);
		saveF.SaveTitleLaborPF(driver, element, gravarArq);
	    saveF.SaveCode2PF(driver, element, gravarArq);
	    saveF.SaveName2PF(driver, element, gravarArq);
	    saveF.SaveDocType2PF(driver, element, gravarArq);
	    saveF.SaveDocNumber2PF(driver, element, gravarArq);
	    saveF.SaveOccupationPF(driver, element, gravarArq);
	    saveF.SaveEmploySituationPF(driver, element, gravarArq);
	    saveF.SaveCompanyNamePF(driver, element, gravarArq);
	    saveF.SaveAdmissionDatePF(driver, element, gravarArq);
	    saveF.SaveExitDatePF(driver, element, gravarArq);
	    saveF.SaveNetIncDepPF(driver, element, gravarArq);
	    saveF.SaveNetIncIndepPF(driver, element, gravarArq);
	    saveF.SaveTotalSumPF(driver, element, gravarArq);
	    saveF.SaveVerifiedNetIncPF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    
	    
	    System.out.println("Informações de Datos Laborales Salvas com Sucesso");
	    
		  //ACESSANDO A ROTA DE CONSULTA DE CONDICIONES IMPOSITIVAS
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnCancel1()));
	    element.click();
	    
	    Thread.sleep(1000);
	    element = driver.findElement(By.id(k.getBtnNegConditions()));
	    element.click();
	    
		
		saveN.TextFileNegConditionsPF(driver, element, arq, gravarArq);
		
		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}
	}

}
