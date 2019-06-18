object Distance extends App { 
    var kmPerHour: Double  = 11.0
    var minutes: Double = 100.0
    var distance: Double = kmPerHour * minutes / 60.0
    println(s"走った距離は${distance}キロメートルです")
}
