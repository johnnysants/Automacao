package consultClientPF;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import keys.AccessKey;
import keys.SaveFields;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import consultClientPJ.SaveDocumentsPJ;

public class SaveDocumentsPF {
	
	AccessKey k = new AccessKey();
	SaveFields saveF = new SaveFields();
	SaveDocumentsPJ saveDoc = new SaveDocumentsPJ();

	
	public void TextFileDocPF(WebDriver driver, WebElement element, FileWriter arq, PrintWriter gravarArq  )throws IOException, InterruptedException{
		
	    try{
	    	
		Thread.sleep(2000);
		saveF.SaveTitleDocumentsPF(driver, element, gravarArq);
	    saveF.SaveCode1PF(driver, element, gravarArq);
	    saveF.SaveName8PF(driver, element, gravarArq);
	    saveF.SaveDocType5PF(driver, element, gravarArq);
	    saveF.SaveDocNumber7PF(driver, element, gravarArq);
	    saveF.SaveDocType6PF(driver, element, gravarArq);
	    saveF.SaveDocNumber2PF(driver, element, gravarArq);
	    saveF.SaveIssueDatePF(driver, element, gravarArq);
	    saveF.SaveExpirationDatePF(driver, element, gravarArq);
	    saveF.SaveValidUntilPF(driver, element, gravarArq);
	    saveF.SaveImageCodePF(driver, element, gravarArq);
	    saveF.SaveNext(gravarArq);
	    
	    arq.close();
	  
	    
	    System.out.println("Informações de Documentos Salvas com Sucesso");
	    
	    JOptionPane.showMessageDialog(null, "Todas Infomações Salvas Com Sucesso");
	    
		} catch (Exception e) {
			// TODO: handle exception
		    JOptionPane.showMessageDialog(null, "Erro na Operação");
		    arq.close(); // Fecha o arquivo de texto
		    driver.close();
	
		}
	    
	    
	}

}
