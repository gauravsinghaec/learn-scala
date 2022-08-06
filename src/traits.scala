trait Speak {
  def speak()
}

trait Language {
  def language() 
}

// This will give error because if you don't implement the trails then the class must be declared as abstract
/*
class Gaurav extends Speak with Language{
  def speak(){
    println("I can speak")
  }
}
*/

// Correct way
abstract class Gaurav extends Speak with Language{
  def speak(){
    println("I can speak")
  }
}

class Anuja extends Speak with Language{
  def speak(){
    println("I can speak") 
  }
  def language(){
    println("I speak in Hindi")
  }
}

object Demo {
  def main(args: Array[String]){
    val anu = new Anuja()
    anu.speak
    anu.language
  }
}


