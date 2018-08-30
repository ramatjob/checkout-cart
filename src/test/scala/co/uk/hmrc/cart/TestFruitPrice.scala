package co.uk.hmrc.cart

import org.scalatest.{Matchers, WordSpecLike}

class TestFruitPrice extends WordSpecLike with Matchers{

  "Apple fruit" should {
    "be of 60p per 1 apple" in {
      Apple.cost shouldBe 0.6
    }
  }

  "Orange fruit" should {
    "be of 25p per 1 orange" in {
      Orange.cost shouldBe 0.25
    }
  }

}
