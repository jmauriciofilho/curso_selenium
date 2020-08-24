package core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class BaseTest {

    @Rule
    private TestName testName = new TestName();

    @After
    public void finaliza() throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
        File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs, new File("target" + File.separator + "screenshot" + File.separator +
                testName.getMethodName() + ".jpg"));

        if (Prorpriedades.FECHAR_BROWSER){
            killDriver();
        }
    }
}
