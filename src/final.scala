final class Gaurav {
  val x: Int = 0
}

class Anuja {
  final val name: String="Anu"
  final def write(){
    println("Hello Anu")
  }
}

class Child1 extends Anuja{
  override val name : String ="Anurav"
}

class Child2 extends Anuja{
  override def write(){
    println("Hello Baby")
  }
}

object Demo {
  def main(args: Array[String]){
    val c1 = new Child1()
    val c2 = new Child2()
    println(c1.name)
    println(c2.write())
  }
}