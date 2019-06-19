object FizzBuzz extends App { 
  
  fizzBuzz(1, 100);
  

  def fizzBuzz(num: Int, max: Int) {
    if (num > max) {
        return;
    }
    if (num % 15 == 0) {
        println("FizzBuzz");
    } else if (num % 5 == 0) {
        println("Fizz");
    } else if (num % 3 == 0) {
        println("Buzz");
    } else {
        println(num);
    }
    return fizzBuzz(num + 1, max);
  }
}
