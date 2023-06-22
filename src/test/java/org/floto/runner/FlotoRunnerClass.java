package org.floto.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FlotoFeaturesFiles", glue="org.floto.stepdefinition",dryRun=false,monochrome=true,strict=true)

public class FlotoRunnerClass {
	

}
