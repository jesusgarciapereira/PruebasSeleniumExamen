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
		// Aquí debes poner la pág web que hay que probar
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
	}

	// Caso con todo correcto
	@Test
	void test01() {
		// Si va por id, es así
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

	// Caso con un error
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
	
	/*
	 * @AfterAll static void exitDriver() { driver1.quit(); }
	 */
}
