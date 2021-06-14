package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanDivideAndMultiply {
	
	private Calculator calculator;
	
	private double actualResult;
	
	@Given("a calculator")
	public void aCalculator() {
		calculator = new Calculator();
	}
	
	@When("{int} and {int} are divided")
	public void areDivided(Integer num1, Integer num2) {
		actualResult = calculator.divide(num1, num2);
	}
	
	@When("{int} and {int} are multiplied")
	public void areMultiplied(Integer num1, Integer num2) {
	    actualResult = calculator.multiply(num2, num1);
	}
	
	@Then("the results should be {int}")
	public void theResultShouldBe(Integer expectedResult) {
	    assertEquals(expectedResult.doubleValue(), actualResult, 2);
	}
}
