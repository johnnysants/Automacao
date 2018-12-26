package keys;

import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConversionFields {
	
	private final String format = ": %s";
	private final String value = "value";
	AccessKey k = new AccessKey();
	
	
	/***********************  COMBOBOX CONTA CORRENTE    ********************************/
	
	public void ConvWaySendExtractCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getWaySendExtract1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("8245")) {
			gravarArq.printf(format,"DIRECCION FISICA");
		} else if (conv.contains("8244")) {
			gravarArq.printf(format,"CORREIO");
		} else if (conv.contains("8246")) {
			gravarArq.printf(format,"MAIL");
		} else if (conv.contains("8247")) {
			gravarArq.printf(format,"NO APLICA");
		} else {
			gravarArq.printf(format,conv);
		}
	}
	
	public void ConvAllowChecksCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getAllowChecks1()));
	   
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("true")) {
			gravarArq.printf(format,"Si");
		} else {
			gravarArq.printf(format,"No");
		}
	}
	
	public void ConvAccountSectorCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getAccountSector1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("7235")) {
			gravarArq.printf(format,"Residentes en el país - Sector privado financiero");
		} else if (conv.contains("7236")) {
			gravarArq.printf(format,"Residentes en el país - Sector privado no financiero");
		} else if (conv.contains("7237")) {
			gravarArq.printf(format,"Residentes en el país - Sector público financiero");
		} else if (conv.contains("7234")) {
			gravarArq.printf(format,"Residentes en el exterior");
		} else {
			gravarArq.printf(format,conv);
		}
	}
	
	public void ConvIntersuccursalSupportCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getIntersuccursalSupport1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));// 
	    
	    if (conv.contains("true")) {
			gravarArq.printf(format,"Si");
		} else {
			gravarArq.printf(format,"No");
		}
	}
	
	public void ConvCodeActivityCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getCodeActivity1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("5137")) {
			gravarArq.printf(format,"No Informada");
		} else {
			gravarArq.printf(format,conv);
		}
	}
	
	public void ConvExemptImmobilizationCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getExemptImmobilization1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	    if (conv.contains("true")) {
			gravarArq.printf(format,"Si");
		} else {
			gravarArq.printf(format,"No");
		}
	}
	
	
	public void ConvBcraActivityCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getBcraActivity1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    System.out.println(conv);
	     if (conv.contains("2197")) {
			gravarArq.printf(format,"Actividades profesionales, científicas y técnicas n.c.p.");
		} else if (conv.contains("2198")) {
			gravarArq.printf(format,"Cria de animales");
		} else if (conv.contains("2199")) {
			gravarArq.printf(format,"Cría de animales S.A");
		} else if (conv.contains("2200")) {
			gravarArq.printf(format,"NO APLICA");
		} else {
			gravarArq.printf(format,conv);
		}
	}
	
	public void ConvSignatureUseCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getSignatureUse1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("6628")) {
			gravarArq.printf(format,"CONJUNTA");
		} else if (conv.contains("6629")) {
			gravarArq.printf(format,"UNIPERSONAL");
		} else {
			gravarArq.printf(format,conv);
		}
	}
	
	public void ConvIVACA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getIVA1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("6082")) {
			gravarArq.printf(format,"Consumidor Final");
		} else if (conv.contains("6083")) {
			gravarArq.printf(format,"IVA Responsable Inscripto");
		} else if (conv.contains("6084")) {
			gravarArq.printf(format,"IVA Sujeto Exento");
		} else if (conv.contains("6085")) {
			gravarArq.printf(format,"Responsable Monotributo");
		} else {
			gravarArq.printf(format,conv);
		}
	}
	
	public void ConvReasonOpenCA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getReasonOpen1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("8177")) {
			gravarArq.printf(format,"APRESENTACAO ESPONTANEA");
	    } else if (conv.contains("8180")) {
				gravarArq.printf(format,"AUTOMATICA");
		} else if (conv.contains("8183")) {
			gravarArq.printf(format,"CAMPANHA"); 
		}
	     else {
			gravarArq.printf(format,conv);
		}
	}
	
	/***********************  COMBOBOX CLIENTE PJ     ********************************/
	
	
	public void ConvSocialTypePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getSocialTypePJ1()));
	    
	    String conv;
	    conv = (element.getAttribute(value));//  
	    
	     if (conv.contains("7216")) {
			gravarArq.printf(format,"Otra Clasificación");
	     } else if (conv.contains("7219")) {
				gravarArq.printf(format,"Sociedad Anónima");
	     } 
	     else {
			gravarArq.printf(format,conv);
	     }
	}

}
