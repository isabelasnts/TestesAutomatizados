package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class PesquisaAmazon extends Pagina{
    public PesquisaAmazon(){
        super();
        driver.get("https://www.amazon.com.br/s?k=logitech+g502&i=computers&crid=38KY0MDSQX0VU&sprefix=%2Ccomputers%2C219&ref=nb_sb_ss_recent_1_0_recent");
    }
//    public WebElement getPaginaDoProduto() {
//        List<WebElement> produtos = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]"));
//        if (produtos.isEmpty()) {
//            return null;
//        }
//        return produtos.get(0);
//    }
//    public WebElement getAdicionarAoCarrinho(){
//        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
//    }
    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
