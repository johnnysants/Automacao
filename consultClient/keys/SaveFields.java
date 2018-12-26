package keys;

import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SaveFields {
	private final String format = ": %s";
	private final String value = "value";
	AccessKey k = new AccessKey();
	ConversionFields conv =new ConversionFields();
	
	/*****************************    CLIENTE PJ         **********************************/
	
	public void SaveTitlePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleConPJ()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCodePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCodePJ()));//Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCodePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
		
	}
	
	public void SaveNamePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNamePJ()));//Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNamePJ1()));//Nome salvo ao cadastrar cliente
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCategoryPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
	    element = driver.findElement(By.id(k.getCategoryPJ()));//Categoría del Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCategoryPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveSocialTypePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getSocialTypePJ()));//Tipo Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getSocialTypePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNotePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNotePJ()));//Observaciones
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNotePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocTypePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocTypePJ()));//Tipo de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocTypePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumberPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumberPJ()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumberPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveConstDatePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getConstDatePJ()));//  Fecha de constitución
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getConstDatePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveBylawsDatePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getBylawsDatePJ()));//  Fecha de Fin de Estatuto Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getBylawsDatePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCapitalPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCapitalPJ()));//  Capital Suscripto
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCapitalPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNatioalityPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNatioalityPJ()));//  Nacionalidad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNatioalityPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));
	    gravarArq.println();//usado para pular linha 
	}
	
	public void SaveCountryConstPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryConstPJ()));//  País de Constitución
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryConstPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCountryActivPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryActivPJ()));//  País de Actividad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryActivPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePlaceActivPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPlaceActivPJ()));//  Lugar de Actividad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPlaceActivPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));
	    gravarArq.println();//usado para pular linha
	}
	public void SaveBcraActivPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getBcraActivPJ()));//  Actividad BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getBcraActivPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//   ARRUMAR PARA TRAZER TEXTO
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNoteActivPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getNoteActivPJ()));//  Observaciones Actividad
		    gravarArq.printf(element.getText());
		    element = driver.findElement(By.id(k.getNoteActivPJ1()));
		    gravarArq.printf(format, element.getAttribute(value));//
		    gravarArq.println();//usado para pular linha
		    
	}
	
	public void SaveSectorBcraPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getSectorBcraPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getSectorBcraPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//   ARRUMAR PARA TRAZER TEXTO
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveResidencePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getResidencePJ()));//  Residencia en el país - Sector Público
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getResidencePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//   ARRUMAR PARA TRAZER TEXTO
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveStartDatePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getStartDatePJ()));//  Fecha de inicio de actividades
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getStartDatePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveEndDatePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEndDatePJ()));//  Fecha de cierre de los Estados Contables
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEndDatePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//   
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePercentagePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPercentagePJ()));//  Porcentaje de participación extranjera
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPercentagePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNext(PrintWriter gravarArq)throws IOException{
	    gravarArq.println("***********************************************************************************");//usado para pular linha
	}
	
	
	/*****************************    CLIENTE PF         **********************************/

	public void SaveTitlePF(WebDriver driver, WebElement element,  PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTitlePF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}

	public void SaveCodePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCodePF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCodePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	    
	}

	public void SaveNamePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNamePF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNamePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveCategoryPF(WebDriver driver, WebElement element,  PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCategoryPF()));//  Categoría del Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCategoryPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveDocTypePF(WebDriver driver, WebElement element,  PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocTypePF()));//  Tipo de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocTypePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveDocNumberPF(WebDriver driver, WebElement element,PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumberPF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumberPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveGenderPF(WebDriver driver, WebElement element,  PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getGenderPF()));//  Sexo
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getGenderPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveDateBirthPF(WebDriver driver, WebElement element,  PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateBirthPF()));//  Fecha de Nacimiento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateBirthPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveCountryBirthPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryBirthPF()));//  País de Nacimiento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryBirthPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SavePlaceBirthPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPlaceBirthPF()));//  Lugar de nacimiento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPlaceBirthPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveNatioalityPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNatioalityPF()));//  Nacionalidad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNatioalityPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SavePlaceResidPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPlaceResidPF()));//  Lugar de Residencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPlaceResidPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	    
	}

	public void SaveTypeResidPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeResidPF()));//  Tipo de Residencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeResidPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveResideFromPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getResideFromPF()));//  Reside desde
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getResideFromPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveCapacityPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCapacityPF()));//  PCapacidad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCapacityPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveCivilStatusPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCivilStatusPF()));//  Estado Civil
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCivilStatusPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveEducationPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEducationPF()));//  Nivel de estudios
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEducationPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveJobPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getJobPF()));//  Ocupación
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getJobPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveProfPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getProfPF()));//  Profesión
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getProfPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveBcraActivPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getBcraActivPF()));//  Actividad BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getBcraActivPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveSectorBcraPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getSectorBcraPF()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getSectorBcraPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/******************************************   DOMICILIOS PJ  ********************************************************************************/
	
	public void SaveTitleAddressPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleAddressPJ()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumberAddPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumberAddPJ()));//  Fecha Desde
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumberAddPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDateFromPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateFromPJ()));//  Fecha Desde
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateFromPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDateUntilPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateUntilPJ()));//  Fecha Hasta
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateUntilPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveTypeResidPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeResidPJ()));//  Tipo de Domicilio
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeResidPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCountryPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveProvincePJ(WebDriver driver, WebElement element,PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getProvincePJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getProvincePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCityPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCityPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCityPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveLocationPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getLocationPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getLocationPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePostCodePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPostCodePJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPostCodePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveNeighborhoodPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNeighborhoodPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNeighborhoodPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveTypeStreetPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeStreetPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeStreetPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveStreetRoutePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getStreetRoutePJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getStreetRoutePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveHouseNumberPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getHouseNumberPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getHouseNumberPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveFloorPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getFloorPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getFloorPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveDepartmentPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDepartmentPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDepartmentPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveNoteAddressPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNoteAddressPJ()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNoteAddressPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	/***************************************                TELEFONOS PJ                  **********************************************************/
	
	
	public void SaveTitlePhonesPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitlePhonesPJ()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCodePJ2(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCodePJ2()));//  Residencia y Sector BCRA
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCodePJ22()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePhoneTypePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPhoneTypePJ()));//  Tipo de Teléfono
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPhoneTypePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveGeoZonePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getGeoZonePJ()));//  Pais / Zona Geográfica / Servicio Mundial
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getGeoZonePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCountryCodePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryCodePJ()));//  Código de País
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryCodePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveAreaCodePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAreaCodePJ()));//  Código de Area
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getAreaCodePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePhoneNumberPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPhoneNumberPJ()));//  Número Teléfono:
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPhoneNumberPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveInternalPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getInternalPJ()));//  Interno
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getInternalPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePreferencePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPreferencePJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPreferencePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***************************************                DOCUMENTOS  PJ                 **********************************************************/
	
	public void SaveTitleDocumentsPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleDocumentsPJ()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCodePJ3(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCodePJ3()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCodePJ33()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNamePJ2(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNamePJ2()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNamePJ22()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocTypePJ2(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocTypePJ2()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocTypePJ22()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumberPJ2(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumberPJ2()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumberPJ22()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocTypePJ3(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocTypePJ3()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocTypePJ33()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumberPJ3(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumberPJ3()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumberPJ33()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDateIssuePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateIssuePJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateIssuePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveExpirationDatePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getExpirationDatePJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getExpirationDatePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveValidUntilPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getValidUntilPJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getValidUntilPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveImageCodePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getImageCodePJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getImageCodePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          CONDICIONES IMPOSITIVAS PJ     **********************************/

	public void SaveTitleNegCondPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleNegCondPJ()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveNamePJ3(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNamePJ3()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNamePJ33()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocTypePJ4(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocTypePJ4()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocTypePJ44()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumberPJ4(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumberPJ4()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumberPJ44()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveIVAPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getIVAPJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getIVAPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveGrossIncomePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getGrossIncomePJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getGrossIncomePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          VÍAS DE COMUNICACIÓN PJ     **********************************/

	public void SaveTitleComChannelsPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleComChannelsPJ()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocTypePJ5(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocTypePJ5()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocTypePJ55()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveTypeDigitalTrackPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeDigitalTrackPJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeDigitalTrackPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveEmailTypePJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEmailTypePJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEmailTypePJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveEmailPJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEmailPJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEmailPJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNote2PJ(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNote2PJ()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNote2PJ1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          DATOS LABORALES PF     **********************************/
	
	public void SaveTitleLaborPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleLaborPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCode2PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCode2PF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCode2PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveName2PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName2PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName2PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveDocType2PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocType2PF()));//  Tipo de documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocType2PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveDocNumber2PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber2PF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber2PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveOccupationPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getOccupationPF()));//  Ocupación
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getOccupationPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveEmploySituationPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEmploySituationPF()));//  Situación Laboral
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEmploySituationPF()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveCompanyNamePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCompanyNamePF()));//  Nombre de la Empresa
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCompanyNamePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveAdmissionDatePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAdmissionDatePF()));//  Fecha Ingreso
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getAdmissionDatePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveExitDatePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getExitDatePF()));//  Fecha Egreso
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getExitDatePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveNetIncDepPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNetIncDepPF()));//  Ing Neto Mensual en relación de dependecia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNetIncDepPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveNetIncIndepPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNetIncIndepPF()));//  Ing Neto Mensual Actividad Independiente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNetIncIndepPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveTotalSumPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTotalSumPF()));//  Sumatoria total
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTotalSumPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveVerifiedNetIncPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getVerifiedNetIncPF()));//  Ingreso neto mensual verificado
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getVerifiedNetIncPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          CONDICIONES IMPOSITIVAS PF     **********************************/
	
	public void SaveTitleNegCondPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleNegCondPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCode1PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCode1PF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCode1PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveName1PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName1PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName1PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocType1PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocType1PF()));//  Tipo de documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocType1PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumber1PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber1PF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber1PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveIVAPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getIVAPF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getIVAPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveGrossIncPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getGrossIncPF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getGrossIncPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	/***********************           DOMICILIOS PF     **********************************/
	
	public void SaveTitleAddressPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleAddressPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCode3PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCode3PF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCode3PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveName3PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName3PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName3PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocType3PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocType3PF()));//  Tipo de documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocType3PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumber3PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber3PF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber3PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDateFromPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateFromPF()));//  Fecha Desde
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateFromPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDateUntilPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateUntilPF()));//  Fecha Hasta
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateUntilPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveTypeAddressPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeAddressPF()));//  Tipo de Domicilio
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeAddressPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCountryPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryPF()));//  País
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveProvincePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getProvincePF()));// Provincia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getProvincePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCityPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCityPF()));//  Ciudad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCityPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveLocationPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getLocationPF()));//  Localidad
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getLocationPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePostCodePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPostCodePF()));//  Código postal
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPostCodePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNeighborhoodPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNeighborhoodPF()));//  Barrio
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNeighborhoodPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveTypeStreetPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeStreetPF()));//  Tipo de calle
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeStreetPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveStreetRoutePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getStreetRoutePF()));//  Calle/Ruta
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getStreetRoutePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNumberKMPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNumberKMPF()));//  Número/KMl
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNumberKMPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveFloorPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getFloorPF()));//  Piso
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getFloorPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDepartmentPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDepartmentPF()));//  Departamento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDepartmentPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNotePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNotePF()));//  Observaciones
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNotePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	
	/***********************          VIAS DE COMUNICACION PF     **********************************/
	
	public void SaveTitleComChannelsPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleComChannelsPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCode4PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCode4PF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCode4PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveName4PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName4PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName4PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocType4PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocType4PF()));//  Tipo de documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocType4PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumber4PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber4PF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber4PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveTypeDigTrackPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getTypeDigTrackPF()));//  Tipo de vía digital
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getTypeDigTrackPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveEmailTypePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEmailTypePF()));//  Sub-Tipo Correo Electrónico
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEmailTypePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveEmailPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getEmailPF()));//  Dirección de correo electrónico
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getEmailPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveNote1PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getNote1PF()));//  Observaciones
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getNote1PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          TELÉFONO PF     **********************************/
	
	public void SaveTitlePhonePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitlePhonePF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveName5PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName5PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName5PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePhoneTypePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPhoneTypePF()));//  Tipo de Teléfono
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPhoneTypePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveGeoZonePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getGeoZonePF()));//  Pais / Zona Geográfica / Servicio Mundial
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getGeoZonePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveCountryCodePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCountryCodePF()));//  Código de País
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCountryCodePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveAreaCodePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAreaCodePF()));//  Código de Area
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getAreaCodePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SavePhoneNumberPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPhoneNumberPF()));//  Número Teléfono:
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPhoneNumberPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SaveInternalPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getInternalPF()));//  Interno
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getInternalPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}

	public void SavePreferencePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPreferencePF()));//  Horario de preferencia
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPreferencePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          PEP PF     **********************************/
	
	public void SaveTitlePEPPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitlePEPPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCode5PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCode5PF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCode5PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveName6PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName6PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName6PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocType5PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocType5PF()));//  Tipo de documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocType5PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumber5PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber5PF()));//  Número de Documentoo
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber5PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveClientPEPPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getClientPEPPF()));//  Cliente PEP
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getClientPEPPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDateSwornPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDateSwornPF()));//  Fecha declaración Jurada
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDateSwornPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SavePositionPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getPositionPF()));//  Cargo/Función/Jerarquía o relación con la Persona Políticamente Expuesta
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getPositionPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          CLASIFICACIONES PF     **********************************/
	
	public void SaveTitleClassfPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleClassfPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveCode6PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCode6PF()));//  Código de Cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCode6PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveName7PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName7PF()));//  Nombre o razón social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName7PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumber6PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber6PF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber6PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveQualifDatePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getQualifDatePF()));//  Fecha de calificación
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getQualifDatePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveClassifBankClientPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getClassifBankClientPF()));//  Clasificacion del Banco para el cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getClassifBankClientPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCustomerSegPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCustomerSegPF()));//  Segmentacion del cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCustomerSegPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCustomerCentralBankClPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCustomerCentralBankClPF()));//  Calificacion de Banco Central del cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCustomerCentralBankClPF()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCutomerCentralBankDatePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCutomerCentralBankDatePF()));//  Fecha de calificacion de Banco Central del cliente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCutomerCentralBankDatePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveClassifSystemsPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getClassifSystemsPF()));//  Clasificacion calculada por los Sistemas
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getClassifSystemsPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveIntervenungUserPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getIntervenungUserPF()));//  Usuario interviniente
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getIntervenungUserPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          DOCUMENTOS PF     **********************************/
	
	public void SaveTitleDocumentsPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleDocumentsPF()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveName8PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getName8PF()));//  Nombre o Razón Social
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getName8PF()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocNumber7PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocNumber7PF()));//  Número de Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocNumber7PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveDocType6PF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getDocType6PF()));//  Tipo de documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getDocType6PF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveIssueDatePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getIssueDatePF()));//  Fecha de emisión
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getIssueDatePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveExpirationDatePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getExpirationDatePF()));//  Fecha de vencimiento del Documento
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getExpirationDatePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveValidUntilPF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getValidUntilPF()));//  Válido hasta
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getValidUntilPF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveImageCodePF(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getImageCodePF()));//  Válido hasta
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getImageCodePF1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	/***********************          CONSULTA DE CONTA CORRENTE      **********************************/

	
	public void SaveTitleCheckAccount(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		 element = driver.findElement(By.id(k.getTitleCheckAccount()));//Titulo da pagina
		 gravarArq.println(element.getText());
		 gravarArq.println();//usado para pular linha
	}
	
	public void SaveProduct1(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getProduct1()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getProduct11()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	    
	}
	
	public void SaveSubProduct1(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getSubProduct1()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getSubProduct11()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveBranchOfc1(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getBranchOfc1()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getBranchOfc11()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCurrency1(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCurrency1()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getCurrency11()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveAccount(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAccount()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getAccount1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveAccountItem(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAccountItem()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getAccountItem1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveShoAccItem(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getShoAccItem()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getShoAccItem1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveAlias(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAlias()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getAlias1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveInsuranceCompany(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getInsuranceCompany()));//  
	    gravarArq.printf(element.getText());
	    element = driver.findElement(By.id(k.getInsuranceCompany1()));
	    gravarArq.printf(format, element.getAttribute(value));//  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveReasonOpen(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getReasonOpen()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvReasonOpenCA(driver, element, gravarArq);    
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveIVA(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getIVA()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvIVACA(driver, element, gravarArq);    
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveSignatureUse(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getSignatureUse()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvSignatureUseCA(driver, element, gravarArq);    
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveBcraActivity(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getBcraActivity()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvBcraActivityCA(driver, element, gravarArq);    
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveExemptImmobilization(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getExemptImmobilization()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvExemptImmobilizationCA(driver, element, gravarArq);  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveCodeActivity(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getCodeActivity()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvCodeActivityCA(driver, element, gravarArq); 
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveIntersuccursalSupport(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getIntersuccursalSupport()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvIntersuccursalSupportCA(driver, element, gravarArq); 
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveAccountSector(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAccountSector()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvAllowChecksCA(driver, element, gravarArq);  
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveAllowChecks(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getAllowChecks()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvAllowChecksCA(driver, element, gravarArq);
	    gravarArq.println();//usado para pular linha
	}
	
	public void SaveWaySendExtract(WebDriver driver, WebElement element, PrintWriter gravarArq)throws IOException{
		element = driver.findElement(By.id(k.getWaySendExtract()));//  
	    gravarArq.printf(element.getText());
	    conv.ConvWaySendExtractCA(driver, element, gravarArq);
	    gravarArq.println();//usado para pular linha
	}
	

	

}
