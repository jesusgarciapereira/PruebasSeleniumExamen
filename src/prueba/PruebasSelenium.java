package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class PruebasSelenium {

	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new FirefoxDriver();

	}
	
	@BeforeEach
	void getURL() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
	}

	@Test
	void test01() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}


	@Test
	void test02() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("");
		fechaBox.sendKeys("21/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertTrue(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}
	
	@Test
	void test03() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("j");
		fechaBox.sendKeys("21/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test04() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("-Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertTrue(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}
	
	@Test
	void test05() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira 2");
		fechaBox.sendKeys("21/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertTrue(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}
	
	@Test
	void test06() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus & Garcia-Pereira");
		fechaBox.sendKeys("21/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertTrue(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}
	
	@Test
	void test07() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test08() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("2");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test09() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/1990/07");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test10() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("07/21/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test11() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("07/1990/21");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test12() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("1990/21/07");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test13() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("1990/07/21");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test14() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21 de julio del 90");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test15() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("-2/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test16() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("50/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test17() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("00/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test18() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("01/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test19() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("02/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test20() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("30/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test21() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("31/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test22() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("32/07/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test23() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/-5/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test24() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/20/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test25() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/00/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void test26() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/01/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test27() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/02/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test28() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/11/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test29() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/12/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDatos = empleadoCorrecto.getText();
		assertEquals("Datos correctos", textoDatos);

	}
	
	@Test
	void test30() {
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("Jesus Garcia-Pereira");
		fechaBox.sendKeys("21/13/1990");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNomApe = driver1.findElement(By.id("errorNomap"));
		boolean textoNomApe = errorNomApe.isDisplayed();
		assertFalse(textoNomApe);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	/*
	 * @AfterAll static void exitDriver() { driver1.quit(); }
	 */
}
