abstract class Gaurav(a: Int){ // Creating constructor  
  val v: Int = a  // Creating variables  
  def run()   // Abstract method  
  def move{   // Non-abstract method  
    println(s"Im moving by ${v}")
  }
}

class Anuja(a : Int) extends Gaurav(a){
  def run {
    println(s"Im running late by ${v} hour(s)")
  }
}

object Demo {
  def main(args: Array[String]){
    val x = new Anuja(3)
    println(x.v)
    x.move
    x.run
  }
}