package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PreenchimentoForm5Page extends Metodos {

	By email = By.id("email");
	By phone = By.id("phone");
	By user = By.id("username");
	By pass = By.id("password");
	By confirma = By.id("confirmpassword");
	By comentario = By.id("Comments");
	By send = By.id("sendemail");
	By texto = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

	public void formulario5() {
		escrever(email, "adil9324@uorak.com");
		escrever(phone, "13998614578");
		escrever(user, "Antonio");
		escrever(pass, "LeonelRJR123");
		escrever(confirma, "LeonelRJR123");
		escrever(comentario, "Compra da BMW dos sonhos, obrigado Deus");
		clicar(send, 10);
		validarTexto(texto, "Sending e-mail success!", 10);
	}

}
