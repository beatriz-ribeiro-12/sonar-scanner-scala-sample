package org.example

import org.scalatest.GivenWhenThen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DogSpec extends AnyFlatSpec with GivenWhenThen with Matchers{

  behavior of "Dog"

  it should "create a Dog" in {
    Given("Dog's name is Max")
    val name = "Max"

    When("a dog is initialized")
    val expected = "Max"
    val result = (new Dog("Max")).name

    Then(s"the result should be $expected")
    assert(expected == result)
  }


}
