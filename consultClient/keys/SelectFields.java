package keys;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectFields {
	
	AccessKey k = new AccessKey();

	
	public void TypeDigitalTrack(WebDriver driver) throws IOException {
		WebElement comboboxElement = driver.findElement(By.id(k.getCbTypeDigTraPJ()));
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("Correo Electrónico");
		}//Tipo de Via de Comunicação
	
	public void Product(WebDriver driver) throws IOException {
		WebElement comboboxElement = driver.findElement(By.id(k.getProduct()));
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("CUENTA CORRIENTE");
		}//Produto Lista de Cuentas
	
	public void SubProduct(WebDriver driver) throws IOException {
		WebElement comboboxElement = driver.findElement(By.id(k.getSubproduct()));
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("CUENTA CORRIENTE PF");
		}//SubProduto Lista de Cuentas

	public void BranchOfc(WebDriver driver) throws IOException {
		WebElement comboboxElement = driver.findElement(By.id(k.getBranchOfc()));
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("0 - CASA CENTRAL");
		}//Sucursal Lista de Cuentas
	
	public void Currency(WebDriver driver) throws IOException {
		WebElement comboboxElement = driver.findElement(By.id(k.getCurrency()));
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("Moneda Local");
		}//Moneda Lista de Cuentas

}
