package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PreenchimentoForm2Page extends Metodos {

	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By DataNiver = By.id("birthdate");
	By male = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	By streetAdress = By.id("streetaddress");
	By contry = By.xpath("//select[@id='country']//option[32]");
	By brazil = By.xpath("//select[@id='country']");
	By cep = By.id("zipcode");
	By cidade = By.id("city");
	By ocupacao = By.xpath("//select[@id='occupation']");
	By publicOffice = By.xpath("//select[@id='occupation']//option[3]");
	By hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	By site = By.id("website");
	By foto = By.id("open");
	By next = By.id("nextenterproductdata");
	
	public void formulario2() throws AWTException, InterruptedException {
		
		escrever(firstName, "Antonio");
		escrever(lastName, "Rodrigues");
		escrever(DataNiver, "08/08/1999");
		clicar(male, 10);
		escrever(streetAdress, "Mario Xavier Correia Assunção");
		clicar(contry, 0);
		clicar(brazil, 0);
		escrever(cep, "11900");
		escrever(cidade, "Registro");
		clicar(ocupacao, 0);
		clicar(publicOffice, 0);
		clicar(hobbies, 0);
		escrever(site, "https://www.linkedin.com/in/antonio-rodrigues-2a10a0245/");
		clicar(foto, 0);
		esperar(2000);
		anexarArquivo();
		clicar(next, 0);
	}
}
