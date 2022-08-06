trait Speak {
  def speak()
}

trait Language {
  def language() 
}

abstract class Home{
  val name : String
  def puja()
}

class Investments(val c: Int) {
  val count : Int = c
  def mf(){
    println("I do invest in MF")
  }
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

// ******* Below code will not compile as it break the scala traits mixin rule ******* //
/*
class NotPerfect extends Speak with Home with Investments{
  def speak(){
    println("I can speak multi languages")
  }
}

class AgainNotPerfect extends Home with Speak with Investments{
  def speak(){
    println("I can speak multi languages")
  }
}
*/

// First abstract class then traits
class Perfect1(override val c: Int) extends Investments(c) with Speak with Language{
  override val count = c
  def speak(){
    println("I can speak in perfect 1")
  }
  def language(){
    println("I know three languages")
  }
}

// First class then traits
class Perfect2 extends Home with Speak with Language{
  override val name = "Golden Home"
  def speak(){
    println("I can speak in perfect 2")
  }
  def language(){
    println("I know two languages")
  }
  def puja(){
    println("I will perform house pooja")
  }
}


object Demo {
  def main(args: Array[String]){
    val anu = new Anuja()
    anu.speak
    anu.language
    println("********* Scala Trait Mixin examples *********")
    val p1 = new Perfect1(16)
    p1.speak
    println(p1.count)
    val p2 = new Perfect2()
    p2.speak
    println(p2.name)
    p2.puja
  }
}


