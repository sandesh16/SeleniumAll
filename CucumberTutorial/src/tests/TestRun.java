package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/logintest.feature",
		glue= {"stepdefinition"}
		)


public class TestRun {

}
