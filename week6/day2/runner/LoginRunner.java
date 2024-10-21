package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/LoginPage.feature",
glue="stepdefinitation",
publish=true,
monochrome=true)

//glue - we have stepdefinitation package name
//publish = basic cucumber report
//monochrome= to remove junk data from console
public class LoginRunner extends AbstractTestNGCucumberTests{

}
//UndefinedStepException - code its in feature file but it is not implement
//DuplicateStepDefinitionException - already code implemented in another class