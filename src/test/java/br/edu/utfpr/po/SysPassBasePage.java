/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author kamil
 */
public class SysPassBasePage extends BasePage{
    
    Menu menu;
    
    public SysPassBasePage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
    }
    
    public Menu getMenu() {
        return menu;
    }
    
    @FindBy(xpath = "//*[@id=\"search\"]") WebElement inputSearch;
    
    @FindBy(xpath = "//*[@id=\"data-search\"]/div/div[1]/div[1]/div[2]/a") WebElement nomeConta;
    
    @FindBy(id = "btnEdit") WebElement btnEdit;
    
    @FindBy(id = "btnDelete") WebElement btnDelete;
    
    @FindBy(xpath = "//*[@id=\"positive\"]") WebElement btnAceitaDeletar;
    
    @FindBy(xpath = "//*[@id=\"res-content\"]/div") WebElement msgErro;
    
    public SysPassBasePage setSearch(String pesquisa){
        inputSearch.sendKeys(pesquisa);
        inputSearch.sendKeys(Keys.ENTER);
        return this;
    }
    
    public SysPassBasePage clickDetails(){
        nomeConta.click();
        return this;
    }
    
    public SysPassBasePage editar(){
        btnEdit.click();
        return this;
    }
    
    public SysPassBasePage excluirConta(){
        btnDelete.click();
        return this;
    }
    
    public SysPassBasePage aceitaDeletar(){
        btnAceitaDeletar.click();
        return this;
    }
    
    public boolean naoTemRegistro(){
        msgErro.isEnabled();
        return true;
    }
    
    
}
