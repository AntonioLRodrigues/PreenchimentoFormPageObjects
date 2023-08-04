package Teste;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import metodos.Metodos;
import pages.PreenchimentoForm1Page;
import pages.PreenchimentoForm2Page;
import pages.PreenchimentoForm3Page;
import pages.PreenchimentoForm4Page;
import pages.PreenchimentoForm5Page;


public class TestTricents extends Metodos {

	PreenchimentoForm1Page page1 = new PreenchimentoForm1Page();
	PreenchimentoForm2Page page2 = new PreenchimentoForm2Page();
	PreenchimentoForm3Page page3 = new PreenchimentoForm3Page();
	PreenchimentoForm4Page page4 = new PreenchimentoForm4Page();
	PreenchimentoForm5Page page5 = new PreenchimentoForm5Page();
	
	@Before
	public void setUp() throws Exception {
		abrirNavegador();
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void validarFormulárioSucesso() throws AWTException, InterruptedException {
		page1.formulário1();
		page2.formulario2();
		page3.formulario3();
		page4.formulario4();
		page5.formulario5();
	}

}
