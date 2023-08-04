package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PreenchimentoForm1Page extends Metodos{

	By makeSelect = By.xpath("(//option[text()='– please select –'])[1]");
	By bmwMake = By.xpath("(//select[@id='make'])//option[3]");
	By modelSelect = By.xpath("(//option[text()='– please select –'])[2]");
	By mopedModel = By.xpath("(//select[@id='model'])//option[4]");
	By ccm = By.id("cylindercapacity");
	By kw = By.id("engineperformance");
	By data = By.id("dateofmanufacture");
	By clicarNumber = By.cssSelector("#numberofseats");
	By number = By.xpath("(//select[@id='numberofseats'])//option[@value='4']");
	By clicarNo = By.xpath("//label[text()='No']");
	By clicarNumberOdSeats = By.xpath("//select[@id='numberofseatsmotorcycle']");
	By numberOdSeats = By.xpath("(//select[@id='numberofseatsmotorcycle'])//option[3]");
	By clicarFuel = By.xpath("//select[@id='fuel']");
	By Fuel = By.xpath("(//select[@id='fuel'])//option[3]");
	By payload = By.id("payload");
	By totalweight = By.id("totalweight");
	By listprice = By.id("listprice");
	By licenseplatenumber = By.id("licenseplatenumber");
	By annualmileage = By.id("annualmileage");
	By clicarNext = By.cssSelector("#nextenterinsurantdata");
	
	
	public void formulário1() {
		clicar(makeSelect, 10);
		clicar(bmwMake, 10);
		clicar(modelSelect, 10);
		clicar(mopedModel, 10);
		escrever(ccm, "1000");
		escrever(kw, "2000");
		escrever(data, "02/08/2023");
		clicar(clicarNumber, 10);
		clicar(number, 10);
		clicar(clicarNo, 10);
		clicar(clicarNumberOdSeats, 10);
		clicar(numberOdSeats, 10);
		clicar(clicarFuel, 10);
		clicar(Fuel, 10);
		escrever(payload, "500");
		escrever(totalweight, "50000");
	    escrever(listprice, "50000");
		escrever(licenseplatenumber, "50000");
		escrever(annualmileage, "50000");
		clicar(clicarNext, 10);
	}
}
