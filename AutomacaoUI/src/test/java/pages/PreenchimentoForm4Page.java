package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PreenchimentoForm4Page extends Metodos {

	By Ultimate = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
	By next = By.cssSelector("#nextsendquote");

	public void formulario4() {

		clicar(Ultimate, 10);
		clicar(next, 10);

	}
}