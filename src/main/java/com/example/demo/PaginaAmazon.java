package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaAmazon extends Pagina {
    public PaginaAmazon() {
        super();
        driver.get("https://www.amazon.com.br/");
    }
    public WebElement getCampoBusca() {
        return driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
    }
    public WebElement getPaginaPrimeiroProduto(){
        return driver.findElement(By.xpath ("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div"));
    }
    public WebElement getAdicionarAoCarrinho(){
        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
    }
    public String getVerificaMensagemCarrinho(){
        return driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]")).getText();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }
}
