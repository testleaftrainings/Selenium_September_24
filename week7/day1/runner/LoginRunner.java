package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/LoginPage.feature",

//Hooks implementation
//glue={"stepdefinitation","hooks"},

//testng flow 
glue="stepdefinitation",
publish=true,
monochrome=true,
tags="not @selenium")
public class LoginRunner extends ProjectSpecificMethod{

}
