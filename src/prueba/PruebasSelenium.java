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
		driver1.get("https://elenarivero.github.io/examen/index.html");
	}

	@Test
	void test01() {
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("Clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement loginCorrecto = driver1.findElement(By.id("login"));
		String textoDatos = loginCorrecto.getText();
		assertEquals("LOGIN CORRECTO", textoDatos);

	}

	@Test
	void test02() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("j2");
		contrasenniaBox.sendKeys("Clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertTrue(textoUsuario);

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertFalse(textoContrasennia);

	}
	
	@Test
	void test03() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jg3");
		contrasenniaBox.sendKeys("Clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertTrue(textoUsuario);

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertFalse(textoContrasennia);

	}
	
	@Test
	void test04() {
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jes4");
		contrasenniaBox.sendKeys("Clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement loginCorrecto = driver1.findElement(By.id("login"));
		String textoDatos = loginCorrecto.getText();
		assertEquals("LOGIN CORRECTO", textoDatos);

	}
	
	@Test
	void test05() {
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesg5");
		contrasenniaBox.sendKeys("Clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement loginCorrecto = driver1.findElement(By.id("login"));
		String textoDatos = loginCorrecto.getText();
		assertEquals("LOGIN CORRECTO", textoDatos);

	}
	
	@Test
	void test06() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("Jesgar-per3");
		contrasenniaBox.sendKeys("Clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertTrue(textoUsuario);

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertFalse(textoContrasennia);

	}
	
	@Test
	void test07() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("C-5");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertFalse(textoUsuario);	

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertTrue(textoContrasennia);

	}
	
	@Test
	void test08() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("Clave/4");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertFalse(textoUsuario);	

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertTrue(textoContrasennia);

	}
	
	@Test
	void test09() {
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("Clave/44");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement loginCorrecto = driver1.findElement(By.id("login"));
		String textoDatos = loginCorrecto.getText();
		assertEquals("LOGIN CORRECTO", textoDatos);

	}
	
	@Test
	void test10() {
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("Clave/123");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement loginCorrecto = driver1.findElement(By.id("login"));
		String textoDatos = loginCorrecto.getText();
		assertEquals("LOGIN CORRECTO", textoDatos);

	}
	
	@Test
	void test11() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("clave.inventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertFalse(textoUsuario);	

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertTrue(textoContrasennia);

	}
	
	@Test
	void test12() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("CLAVE.INVENTADA3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertFalse(textoUsuario);	

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertTrue(textoContrasennia);

	}
	
	@Test
	void test13() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("Clave.inventada");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertFalse(textoUsuario);	

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertTrue(textoContrasennia);

	}
	
	@Test
	void test14() {
		
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));
		WebElement contrasenniaBox = driver1.findElement(By.id("password"));

		usuarioBox.sendKeys("jesgarper3");
		contrasenniaBox.sendKeys("claveInventada3");

		WebElement submitButton = driver1.findElement(By.id("enviar"));
		submitButton.click();

		WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
		boolean textoUsuario = errorUsuario.isDisplayed();
		assertFalse(textoUsuario);	

		WebElement errorContrasennia = driver1.findElement(By.id("errorPassword"));
		boolean textoContrasennia = errorContrasennia.isDisplayed();
		assertTrue(textoContrasennia);

	}
	
	
	
	/*
	 * @AfterAll static void exitDriver() { driver1.quit(); }
	 */
}
