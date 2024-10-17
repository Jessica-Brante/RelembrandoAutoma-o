import static org.junit.Assert.*;

import javax.swing.plaf.basic.BasicTableHeaderUI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinhaPrimeiraAutomacaoadvantage {

	
    WebDriver navegador;	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		navegador = new ChromeDriver();
		
		navegador.get("https://www.advantageonlineshopping.com/#/");
		
		navegador.manage().window().maximize();
		Thread.sleep(3000);
		
		navegador.findElement(By.id("menuUser")).click();
		
		navegador.findElement(By.name("username")).sendKeys("turma20tt");
		
		Thread.sleep(3000);
				
		navegador.findElement(By.name("password")).sendKeys("Fc23091995@");
		
				
		navegador.findElement(By.id("sign_in_btn")).click();
		Thread.sleep(5000);
		
		navegador.quit();
		
		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
