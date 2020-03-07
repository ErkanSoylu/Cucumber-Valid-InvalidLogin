package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:cucumber-html-reports","json: cucumber-html-report/cucumber.json"},features = "classpath:AmazonLogin.feature")
public class MyTest {
}
