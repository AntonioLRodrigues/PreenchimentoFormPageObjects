package metodos;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos {

	public static WebDriver driver;

	public static void abrirNavegador() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();

	}

	public void clicar(By elemento, int tempo) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement usuario = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		usuario.click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void anexarArquivo() throws AWTException {
		try {
			Robot rb = new Robot();
			StringSelection ss = new StringSelection(
					"C:\\Users\\Antonio\\OneDrive\\Documentos\\curriculo\\curriculo_medico_2.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

	public void esperar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void fecharNavegador() {
		driver.close();
	}
	public void validarTexto(By elemento, String textoEsperado, int tempo) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement elementoVisivel = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

		String textoCapturado = elementoVisivel.getText();
		assertEquals(textoEsperado, textoCapturado);
	}
}
