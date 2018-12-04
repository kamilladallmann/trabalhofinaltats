/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import static org.openqa.selenium.By.xpath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author kamil
 */
public class HomePage extends SysPassBasePage{
    
    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("http://192.168.15.9");
    } 
}