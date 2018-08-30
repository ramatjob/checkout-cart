package co.uk.hmrc

package object cart {

  trait Item { val cost: BigDecimal; val name: String }
  case object Apple extends Item { val cost = 0.6; val name = "apple" }
  case object Orange extends Item { val cost = 0.25; val name = "orange" }
  case object UnknownItem extends Item { val cost = 0; val name = "unkown" }

  private val inventory = Seq(Apple, Orange)
  def addAllTheCartItems(items: Seq[String]): Seq[Item] = {
    items.map(item => inventory.find(_.name.equalsIgnoreCase(item)).getOrElse(UnknownItem))
  }

  def calculateItemsTotal(items: Seq[Item]): BigDecimal =
    items.foldLeft(BigDecimal(0))(_ + _.cost)

}