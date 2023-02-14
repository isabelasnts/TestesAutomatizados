package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTests {
    protected void pesquisaProduto(final String pesquisa) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabe\\Downloads\\chromedriver.exe");
        PaginaInicialAmazon homePage = new PaginaInicialAmazon();
        WebElement campoBusca = homePage.getCampoBusca();
        campoBusca.click();
        campoBusca.sendKeys(pesquisa+Keys.ENTER);
    }
   @Test
    void getBusca() {
        pesquisaProduto("Logitech g502");
    }

    private void fazLogin(final String email){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabe\\Downloads\\chromedriver.exe");
        PaginaInicialAmazon homePage = new PaginaInicialAmazon();
        WebElement linkEmail = homePage.getLinkEmail();
        linkEmail.click();
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