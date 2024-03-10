package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\Decembermaven\\Feature\\cucumber.feature"
,glue="org.stepdefinitions")
public class TestRunner {

}
