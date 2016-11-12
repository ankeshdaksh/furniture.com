package made.com;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.deps.com.thoughtworks.xstream.security.ExplicitTypePermission;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

/**
 * Created by kailash on 09/11/2016.
 */
public class BaseTest extends BaseMain {
    BaseMain baseMain = new BaseMain();

    @Before

    public void openBrowser() throws IOException, InterruptedException {
        baseMain.setUP();
        Thread.sleep(3000);

    }

    @After
    public void close(){
        baseMain.tearDown();
    }



}
