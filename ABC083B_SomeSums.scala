object ABC083B_SomeSums extends App {
    val sc = new java.util.Scanner(System.in)
    val n: Int = sc.nextInt
    val min: Int = sc.nextInt
    val max: Int = sc.nextInt
 
    val sum: Int = (1 to n).toString.split("")
                    .map(_.toInt)
                    .filter(digitsSum => digitsSum >= min && digitsSum <= max)
                    .sum
    println(sum)

}