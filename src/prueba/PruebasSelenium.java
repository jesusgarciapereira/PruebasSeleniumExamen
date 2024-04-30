package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
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

	@Test
	void test01() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nomApeBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nomApeBox.sendKeys("123");
		fechaBox.sendKeys("+");

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
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("123");
		directivoBox.sendKeys("-");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		// Es el elemento del h3
		WebElement empleadoCorrecto = driver1.findElement(By.tagName("h3"));
		String textoDireccion = empleadoCorrecto.getText();
		assertEquals("EMPLEADO AÑADIDO CORRECTAMENTE", textoDireccion);

	}

	@Test
	void test03() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test04() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("1");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test05() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("123456");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test06() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("000");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}

	@Test
	void test07() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("12");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test08() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("1234");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test09() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("ole");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test10() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("&-%");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test11() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("3.4");
		directivoBox.sendKeys("+");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertTrue(textoNumEmpleado);

		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertFalse(textoDirectivo);

	}
	
	@Test
	void test12() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("123");
		directivoBox.sendKeys("");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertFalse(textoNumEmpleado);
		
		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertTrue(textoDirectivo);

	}
	
	@Test
	void test13() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("123");
		directivoBox.sendKeys("*");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertFalse(textoNumEmpleado);
		
		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertTrue(textoDirectivo);

	}
	
	@Test
	void test14() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("123");
		directivoBox.sendKeys("+-%");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertFalse(textoNumEmpleado);
		
		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertTrue(textoDirectivo);

	}
	
	@Test
	void test15() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpleadoBox = driver1.findElement(By.id("numero"));
		WebElement directivoBox = driver1.findElement(By.id("directivo"));

		numEmpleadoBox.sendKeys("123");
		directivoBox.sendKeys("+-");

		// Es el primer input con el value='Enviar'
		WebElement submitButton = driver1.findElement(By.xpath("//input[@value='Enviar']"));
		submitButton.click();

		WebElement errorNumEmpleado = driver1.findElement(By.id("errorNumero"));
		boolean textoNumEmpleado = errorNumEmpleado.isDisplayed();
		assertFalse(textoNumEmpleado);
		
		WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
		boolean textoDirectivo = errorDirectivo.isDisplayed();
		assertTrue(textoDirectivo);

	}
	
	/*
	 * @AfterAll static void exitDriver() { driver1.quit(); }
	 */
}
