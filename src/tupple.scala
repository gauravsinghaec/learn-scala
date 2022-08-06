object Demo {
  def main(args: Array[String]){
    val tupple1 = (1,2,4,5,8)
    val tupple2 = ("Anuja", 22, "Gaurav", 1, 4, 9)
    val tupple3 = (2.8, 22, 15.6, 1, 4, 9)
    println("\n************* Basic Tupples ************")
    println(tupple1)
    println(tupple2)
    println(tupple3)
    println("\n************* Iterating Tupples using 'productIterator' ************")
    tupple3.productIterator.foreach(println)

    println("\n************* Accessing Tupple values ************")
    println(s"tupple2._1 = ${tupple2._1}")
    println(s"tupple2._3 = ${tupple2._3}")

    println("\n************* Pattern Matching in Tupple ************")
    val ingredient = ("Sugar", 25)
    val (name, quantity) = ingredient
    println(s"name = ${name}")
    println(s"quantity = ${quantity}")

    val planets =
      List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
          ("Mars", 227.9), ("Jupiter", 778.3))
    planets.foreach {
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ =>
    }
  }
}