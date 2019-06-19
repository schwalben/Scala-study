object CalcPractice extends App { 

  println(s"sum1ToNum(10): ${sum1ToNum(-10, 0)}")
  
  def sum1ToNum(num: Int, sum: Int = 0): Int = {

    if (num <= 1) {
      return if (num <= 0) num else sum + 1
    }
    return sum1ToNum(num - 1, sum + num)
  }

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(s"addThenMultiply(2, 3)(10): ${addThenMultiply(2, 3)(10)}")

}
