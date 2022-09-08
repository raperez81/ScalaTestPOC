package AcceptanceTests

import sample._

class CalculatorTests extends AcceptanceTestSpec {
  info("As a Calculator User")
  info("I want to be able to ...")

  Feature("Sum") {
    Scenario("User calls the sum method with 2 integers"){
      Given("4 + 5")
      val expression = "4 + 5"

      When("Calculator is called")
      val result = Calculator.apply(expression)

      Then("The result should be 9")
      assert(result == 9)
    }
    Scenario("User calls the sum method with zeros"){
      Given("0 + 0")
      val expression = "0 + 0"

      When("Calculator is called")
      val result = Calculator.apply(expression)

      Then("The result should be 0")
      assert(result == 0)
    }

  }
}
