package made.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags={"@smoke,@kaialsh"},
        features = "src/test/made.com"

)
public class Run {


}
