package co.uk.hmrc.cart

import org.scalatest.{Matchers, WordSpecLike}

class TestFruitNames extends WordSpecLike with Matchers{

  "Checkout cart" should {
    "calculate the correct sum if check out cart contains any fruit names that are other than apple and orange" in {
      val fruitList = Seq(
        "apple","watermelon","orange","invalidFruit","apple","kiwi","orange","badFruit","apple","orange"
      )

      val expectedSumOfCart = (Apple.cost * 3) + (Orange.cost * 3)

      val actualSumOfCart = calculateItemsTotal(fruitList)

      actualSumOfCart shouldBe expectedSumOfCart

    }
  }

}
