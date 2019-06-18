object Euclid extends App { 

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0) {
      return b
    } else if (b == 0) {
      return a
    }
    return greatestCommonDivisor(b, a % b)
  }
}
