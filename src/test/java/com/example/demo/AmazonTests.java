package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.demo.Pagina.driver;

public class AmazonTests {
    protected void pesquisaProduto(final String pesquisa) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabe\\Downloads\\chromedriver.exe");
        PaginaAmazon homePage = new PaginaAmazon();
        WebElement campoBusca = homePage.getCampoBusca();
        campoBusca.click();
        campoBusca.sendKeys(pesquisa+Keys.ENTER);
    }
    @Test
    void getBusca() {
        pesquisaProduto("Logitech g502");
    }
    protected void adicionaPrimeiroProdutoAoCarrinho(final String pesquisa){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabe\\Downloads\\chromedriver.exe");
        PaginaAmazon homePage = new PaginaAmazon();
        WebElement campoBusca = homePage.getCampoBusca();
        campoBusca.click();
        campoBusca.sendKeys(pesquisa+Keys.ENTER);
        WebElement espera = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(driver -> driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div")));
        WebElement clicaPrimeiroProduto = homePage.getPaginaPrimeiroProduto();
        clicaPrimeiroProduto.click();
        WebElement clicaAdicionarAoCarrinho = homePage.getAdicionarAoCarrinho();
        clicaAdicionarAoCarrinho.click();
        clicaAdicionarAoCarrinho.sendKeys(Keys.ESCAPE);
        WebElement esperaConfirmacao = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(driver -> driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]")));
        Assert.assertTrue(homePage.getVerificaMensagemCarrinho().equals("Adicionado ao carrinho"));
    }
    @Test
    void getAdicionaAoCarrinho(){
        adicionaPrimeiroProdutoAoCarrinho("logitech g502");
    }
    private void fazLogin(final String email){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabe\\Downloads\\chromedriver.exe");
        LoginAmazon paginaLogin = new LoginAmazon();
        WebElement campoEmail = paginaLogin.getCampoEmail();
        campoEmail.sendKeys(email+Keys.ENTER);
    }
    @Test
    void emailIsValido(){
        fazLogin("mail@mail.com");
    }
    @Test
    void emailIsNotValido(){
        fazLogin("mail@.com");
    }
}