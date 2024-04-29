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
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("41010");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement direccionCorrecta = driver1.findElement(By.id("cabecera"));
        String textoDireccion = direccionCorrecta.getText();
        assertEquals("Dirección correcta", textoDireccion);
        
	}
	
	@Test
	void test02() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("");
        cpBox.sendKeys("41010");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertTrue(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertFalse(texto);
                
	}

	@Test
	void test03() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C");
        cpBox.sendKeys("41010");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement direccionCorrecta = driver1.findElement(By.id("cabecera"));
        String textoDireccion = direccionCorrecta.getText();
        assertEquals("Dirección correcta", textoDireccion);
        
	}
	
	@Test
	void test04() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("21 C/Procurador, \\2-D. Sevilla");
        cpBox.sendKeys("41010");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertTrue(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertFalse(texto);
                
	}
	
	@Test
	void test05() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("-C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("41010");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertTrue(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertFalse(texto);
                
	}
	
	@Test
	void test06() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. &Sevilla");
        cpBox.sendKeys("41010");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertTrue(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertFalse(texto);
                
	}
	
	@Test
	void test07() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test08() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("1");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test09() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("12");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test10() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("123456789");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test11() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("4101");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test12() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("410104");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test13() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("codig");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test14() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("%-/#|");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	
	@Test
	void test15() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("C/Procurador, 21\\2-D. Sevilla");
        cpBox.sendKeys("410.10");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
                
	}
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
