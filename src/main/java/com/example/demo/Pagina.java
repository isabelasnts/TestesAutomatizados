package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagina {
    protected static WebDriver driver;
    public Pagina(){
        driver = new ChromeDriver();
    }

    public String getTitle(){
        return driver.getTitle();
    }
}