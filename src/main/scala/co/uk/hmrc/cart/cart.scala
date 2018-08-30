package co.uk.hmrc

package object cart {

  trait Item { val cost: BigDecimal; val name: String }
  case object Apple extends Item { val cost = 0.6; val name = "apple" }
  case object Orange extends Item { val cost = 0.25; val name = "orange" }

}