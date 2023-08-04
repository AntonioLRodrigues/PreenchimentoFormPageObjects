package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PreenchimentoForm3Page extends Metodos {

	By startDate = By.id("startdate");
	By insurance = By.id("insurancesum");
	By cincoMil = By.xpath("//select[@id=\"insurancesum\"]//option[3]");
	By merit = By.id("meritrating");
	By bonus = By.xpath("//*[@id=\"meritrating\"]//option[3]");
	By damage = By.id("damageinsurance");
	By full = By.xpath("//*[@id=\"damageinsurance\"]//option[4]");
	By optional = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	By courtesy = By.id("courtesycar");
	By no = By.xpath("//*[@id=\"courtesycar\"]//option[2]");
	By next = By.id("nextselectpriceoption");

	public void formulario3() {

		escrever(startDate, "09/07/2023");
		clicar(insurance, 0);
		clicar(cincoMil, 0);
		clicar(merit, 0);
		clicar(bonus, 0);
		clicar(damage, 0);
		clicar(full, 5);
		clicar(optional, 5);
		clicar(courtesy, 0);
		clicar(no, 0);
		clicar(next, 0);

	}

}
