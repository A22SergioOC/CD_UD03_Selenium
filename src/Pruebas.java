import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Probas
 */
public class Pruebas {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sergio\\Desktop\\Trabajos_1DAW\\Contornos_de_desarrollo\\Segundo_Trimestre\\SeleniumTarea\\CD_UD03_Selenium\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.carrefour.es/");
    }

    @Test
    public void CPF1() throws InterruptedException{
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        driver.findElement(By.id("search-input")).click();
        driver.findElement(By.cssSelector("[inputmode='search']")).sendKeys("Lentejas");
        driver.findElement(By.className("ebx-search-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ebx-empathy-x__body>section>article:first-child>div:first-child")).click();
        driver.findElement(By.cssSelector("[data-scroll-id='536500291']>div>div>a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='add-to-cart-button__full-button add-to-cart-button__button']")).click();
        driver.findElement(By.cssSelector("[class='sale-point-dialog']>div>span::before")).click();
        //No terminado
    }

    @Test
    public void CPF2() throws InterruptedException{
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        driver.findElement(By.id("search-input")).click();
        driver.findElement(By.cssSelector("[inputmode='search']")).sendKeys("Ordenador");
        driver.findElement(By.className("ebx-search-button")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".ebx-facet__filters>li:first-child")).click();
        //No terminado
    }

    @Test
    public void CPF5() throws InterruptedException{
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        driver.findElement(By.cssSelector("[title='Contacto']")).click();
        WebElement title = driver.findElement(By.cssSelector("[class='w991 centered']>h1"));
        assertEquals("Ayuda y contacto", title.getText());
    }

    @Test
    public void CPF6() throws InterruptedException{
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        driver.findElement(By.cssSelector("[title='Inicio de sesión']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("gigya-loginID-133272631659353340")).sendKeys("example@example.org");
        driver.findElement(By.cssSelector("[value='Continuar']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("abc123..");
        driver.findElement(By.cssSelector("passwordRetype")).sendKeys("abc123...");
        Thread.sleep(1000);
        WebElement text = driver.findElement(By.cssSelector("[data-screenset-element-id='__gig_template_element_211_1678732471205']"))
        assertEquals("Las contraseñas no coinciden", text.getText());
        //Dá error
    }
}

