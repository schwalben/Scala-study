object CalcPractice extends App { 

  println(s"sum1ToNum(10): ${sum1ToNum(10)}")
  
  def sum1ToNum(num: Int): Int = {

    if (num <= 1) {
      return num
    }
    return num + sum1ToNum(num - 1)
  }

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(s"addThenMultiply(2, 3)(10): ${addThenMultiply(2, 3)(10)}")

}
