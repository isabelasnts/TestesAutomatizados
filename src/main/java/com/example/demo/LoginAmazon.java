package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginAmazon extends Pagina{
    public LoginAmazon(){
        super();
        driver.get("https://www.amazon.com.br/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.br%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=brflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    }

    public WebElement getCampoEmail() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]"));
    }

    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
