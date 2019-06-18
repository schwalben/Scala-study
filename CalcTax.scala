object CalcTax extends App {

  def calcTax(price: Int): Int = {
    val tax = 1.08
    return (price * tax).toInt
  }

  println(calcTax(129512))


  

}