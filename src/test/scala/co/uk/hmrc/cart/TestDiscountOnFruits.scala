package co.uk.hmrc.cart

import org.scalatest.{Matchers, WordSpecLike}

class TestDiscountOnFruits extends WordSpecLike with Matchers{
  val fruitList = Seq(
    Apple, Apple, Orange, Apple, Apple, Apple, Orange, Orange, Apple, Apple,
    Orange, Apple, Orange, Orange, Orange, Apple, Orange, Orange, Orange, Apple
  )

  "Discount on fruits" should {
    "be 1 for 1 for apples" in {

      val actualDiscountPriceOnApples = discountPriceForItems(fruitList,Apple,2)
      val expectedDiscountPriceOnApples = Apple.cost * 5

      actualDiscountPriceOnApples shouldBe expectedDiscountPriceOnApples
    }

    "be 2 for 1 for oranges" in {
      val actualDiscountPriceOnOranges = discountPriceForItems(fruitList,Orange,3)
      val expectedDiscountPriceOnOranges = Orange.cost * 3

      actualDiscountPriceOnOranges shouldBe expectedDiscountPriceOnOranges
    }
  }
}
