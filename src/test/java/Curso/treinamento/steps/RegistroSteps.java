package Curso.treinamento.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class RegistroSteps {

	WebDriver driver;

	@Dado("^que eu esteja na tela de Registro$")
	public void que_eu_esteja_na_tela_de_Registro() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertTrue("Página 'Register' não apresentada com sucesso.",
				driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif']")).isDisplayed());

	}

	@Quando("^faço o preenchimento das informações da tela de Register$")
	public void faço_o_preenchimento_das_informações_da_tela_de_Register(DataTable dataTable) throws Throwable {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		
		driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("First Name") );
		driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("Last Name"));
		driver.findElement(By.name("phone")).sendKeys(list.get(0).get("Phone"));
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("Email"));
		driver.findElement(By.name("address1")).sendKeys(list.get(0).get("Adress"));
		driver.findElement(By.name("address2")).sendKeys(list.get(0).get("Adress Complement"));
		driver.findElement(By.name("city")).sendKeys(list.get(0).get("City"));
		driver.findElement(By.name("state")).sendKeys(list.get(0).get("State Province"));
		driver.findElement(By.name("postalCode")).sendKeys(list.get(0).get("Postal Code"));
		driver.findElement(By.name("country")).sendKeys(list.get(0).get("Country"));
		driver.findElement(By.name("email")).sendKeys(list.get(0).get("User Name"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
		driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("Confirm Password"));
		driver.findElement(By.name("register")).click();
		
	
	}

}
