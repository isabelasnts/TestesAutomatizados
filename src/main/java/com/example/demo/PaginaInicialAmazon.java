package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaInicialAmazon extends Pagina {
    public PaginaInicialAmazon() {
        super();
        driver.get("https://www.amazon.com.br/");
    }
    public WebElement getCampoBusca() {
        return driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
    }
    public WebElement getLinkEmail(){
        return driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]"));
    }
    @Override
    public String getTitle() {
        return driver.getTitle();
    }
}
