package test;

import core.DSL;
import core.DriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.*;

public class TesteAjax {

    private DSL dsl;

    @Before
    public void inicializa(){
        getDriver().get("https://www.primefaces.org/showcase/ui/ajax/basic.xhtml");
        dsl = new DSL();
    }

    @After
    public void finaliza(){
        killDriver();
    }

    @Test
    public void testeAjax(){
        dsl.escrever("j_idt725:name", "Teste");
        dsl.clicarBotao("j_idt725:j_idt728");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.textToBe(By.id("j_idt725:display"), "Teste"));
        Assert.assertEquals("Teste", dsl.obterTexto("j_idt725:display"));
    }
}
