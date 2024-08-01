package step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( //tags = "@positive",
                  features = {"classpath:features"},
                  glue = {"classpath:step_definitions"}
            )

public class Runner extends AbstractTestNGCucumberTests{

}
