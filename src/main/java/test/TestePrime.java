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

import static core.DriverFactory.*;

public class TestePrime {

    private DSL dsl;

    @Before
    public void inicializa(){
        getDriver().get("https://www.primefaces.org/showcase/ui/input/oneRadio.xhtml");
        dsl = new DSL();
    }

    @After
    public void finaliza(){
        killDriver();
    }

    @Test
    public void deveInteragirComRadioPrime(){
        dsl.clicarRadio(By.xpath("//input[@id='j_idt726:console:0']/../..//span"));
        Assert.assertTrue(dsl.isRadioMarcado("j_idt726:console:0"));

        dsl.clicarRadio(By.xpath("//label[.='PS4']/..//span"));
        Assert.assertTrue(dsl.isRadioMarcado("j_idt726:console:1"));
    }
}
