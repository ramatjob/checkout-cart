package co.uk.hmrc.cart

import org.scalatest.{Matchers, WordSpecLike}

class TestFinalCheckoutPrice extends WordSpecLike with Matchers{
  "Final checkout" should {
    "apply the corresponding fruit offers to the checkout cart and should show the proper final checkout price" in {
      val fruitList = List(
        "apple","apple","orange","apple","apple","apple","orange","orange","apple","apple",
        "orange","apple","orange","orange","orange","apple","orange","orange","orange","apple"
      )
      val actualFinalCheckoutPrice = finalCheckoutCart(fruitList)
      val expectedFinalCheckoutPrice = (Orange.cost * 7 + Apple.cost * 5)

      actualFinalCheckoutPrice shouldBe expectedFinalCheckoutPrice
    }
  }
}
