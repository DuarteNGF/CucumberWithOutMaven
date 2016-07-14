package cucumber.features;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class StepDefenitions{
	private StringBuffer verificationErrors = new StringBuffer();
  
	  
	@When("^I click on the adoption link$")
	public void shouldClickOnAdoption() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("executed the adoption link method");
		    
	}

	@Then("^I check to see that no animals are available$")
	public void checkAnimalStringVisible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("checked that the no animals string was visible or not");
		
	}
	
	
	//TESTE AO FORMULÁRIO DE CONTACTOS
	
	WebDriver driver = null;

	/*
	
	
	@Given("^Entrar no site do olx$")
	public void souldNavigateToOLX() throws Throwable {
	    driver = new FirefoxDriver();
	    driver.navigate().to("https://olx.pt/");
	    
	}

	@When("^Clicar noo link dos contactos$")
	public void shouldClickLinkContacts() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='lastwrapper']/div/div[2]/div[1]/div[3]/ul/li[4]/a/span")).click();
	    
	}

	@When("^Preencher o formulario$")
	public void ShouldPopulateContacts() throws Throwable {
		driver.findElement(By.linkText("-")).click();
		driver.findElement(By.id("registo_conta")).click();
		Thread.sleep(2000);
	    driver.findElement(By.linkText("-")).click();
	    driver.findElement(By.id("como_criar_uma_conta")).click();
	    driver.findElement(By.id("request_description")).clear();
	    driver.findElement(By.id("request_description")).sendKeys("Ola eu Sou a Joana");
	    driver.findElement(By.id("request_anonymous_requester_email")).clear();
	    driver.findElement(By.id("request_anonymous_requester_email")).sendKeys("joanabanana@joana.com");
	    driver.findElement(By.id("request_custom_fields_27990841")).click();
	    driver.findElement(By.id("request_custom_fields_27990841")).clear();
	    driver.findElement(By.id("request_custom_fields_27990841")).sendKeys("Eu sou a joana");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("footer > input[name=\"commit\"]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Validar a mensagem de sucesso$")
	public void shouldValidateMessageSucess() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/div/span[2]"));
		
	}
	
	@Then("^Fechar o browser$")
	public void shouldCloseBrowser() throws Throwable {
		driver.close();
	}


	@When("^Clicar no link dos \"([^\"]*)\"$")
	public void clicar_no_link_dos(String link) throws Throwable {
		driver.findElement(By.xpath(link)).click();
	}
	
	*/
	
	@Before
	public void testSetUp(){
		//driver = new FirefoxDriver();
		System.out.println("Before method executed");
	}
	
	@After
	public void testShutDown(){
		//driver.close();
		System.out.println("After method executed");
	}
	
	@Before("@web")
	public void testSetUpWebTag(){
		driver = new FirefoxDriver();
		System.out.println("Before method with web tag executed");
	}
	
	@After("@web")
	public void testShutDownWebTag(){
		driver.close();
		System.out.println("After method with web tag executed");
	}
	
	@Given("^Entrar no site do olx$")
	public void souldNavigateToOLX() throws Throwable {
	    
	    driver.navigate().to("https://olx.pt/");
	    driver.manage().window().maximize();
	    System.out.println("executed the navigate too OLX");
	}
	    
	@When("^Clicar no link dos \"([^\"]*)\"$")
	public void clicar_no_link_dos(String link) throws Throwable {
		driver.findElement(By.xpath(link)).click();
		System.out.println("executed click link"+link);
	}

	
	@When("^Preencher o formulario$")
	public void ShouldPopulateContacts(DataTable table) throws Throwable {
		System.out.println(table);
		
		List<List<String>> data = table.raw();
		
		System.out.println(data.get(1).get(1));
		
		driver.findElement(By.linkText("-")).click();
		driver.findElement(By.id(data.get(1).get(1))).click();
		Thread.sleep(2000);
	    driver.findElement(By.linkText("-")).click();
	    driver.findElement(By.id(data.get(2).get(1))).click();
	    driver.findElement(By.id("request_description")).clear();
	    driver.findElement(By.id("request_description")).sendKeys(data.get(3).get(1));
	    driver.findElement(By.id("request_anonymous_requester_email")).clear();
	    driver.findElement(By.id("request_anonymous_requester_email")).sendKeys(data.get(4).get(1));
	    driver.findElement(By.id("request_custom_fields_27990841")).click();
	    driver.findElement(By.id("request_custom_fields_27990841")).clear();
	    driver.findElement(By.id("request_custom_fields_27990841")).sendKeys(data.get(5).get(1));
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("footer > input[name=\"commit\"]")).click();
	    Thread.sleep(2000);
	    System.out.println("executed populate form");
	}

	/*@Then("^Validar a mensagem de sucesso \"([^\"]*)\"$")
	public void shouldValidateMessageSucess(String msg) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(msg));
		System.out.println("executed validation message");
		
	}*/
	
	
	@Then("^Validar a mensagem de sucesso OLX \"([^\"]*)\"$")
	public void validar_a_mensagem_de_sucesso_OLX_OLX(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
		System.out.println("executed validate message");
	}

	@Then("^Fechar o browser$")
	public void shouldCloseBrowser() throws Throwable {
		
		System.out.println("executed close the browser");
	}

	
}
