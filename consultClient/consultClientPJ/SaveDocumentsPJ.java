package consultClientPJ;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import keys.SaveFields;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaveDocumentsPJ {
	
	SaveFields saveF = new SaveFields();
	SaveNegativeConditionsPJ saveN = new SaveNegativeConditionsPJ();
	
	
	public void TextFileDocumentsPJ(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
		try{
	    
		Thread.sleep(2000);
		saveF.SaveTitleDocumentsPJ(driver, element, gravarArq);
	    saveF.SaveCodePJ3(driver, element, gravarArq);
	    saveF.SaveNamePJ2(driver, element, gravarArq);
	    saveF.SaveDocTypePJ2(driver, element, gravarArq);
	    saveF.SaveDocNumberPJ2(driver, element, gravarArq);
	    saveF.SaveDocTypePJ3(driver, element, gravarArq);
	    saveF.SaveDocNumberPJ3(driver, element, gravarArq);
	    saveF.SaveDateIssuePJ(driver, element, gravarArq);
	    saveF.SaveExpirationDatePJ(driver, element, gravarArq);
	    saveF.SaveValidUntilPJ(driver, element, gravarArq);
	    saveF.SaveImageCodePJ(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	  
	    
	    
	    System.out.println("Informações de Documentos Salvas com Sucesso");
	    
	    
	    
	    saveN.TextFileNegConditionsPJ(driver, element, arq, gravarArq);
	    
		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}
	    

	}

}
