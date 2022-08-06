trait mytrait

case class CaseClass(a:Int, b:Int)  extends mytrait
case class CaseClass1(a:Int)  extends mytrait
case object CaseObject extends mytrait


object Demo {  
  def main(args:Array[String]){  
    var c =  CaseClass(10,10)       // Creating object of case class  
    println("a = "+c.a)             // Accessing elements of case class  
    println("b = "+c.b)  
    
    println("\n*************Case class examples***************")
    callMe(CaseClass(4,8))
    callMe(CaseClass1(67))
    callMe(CaseObject)
  }  

  def callMe(data: mytrait) {
    data match {
      case CaseClass(x,y) => println(s"a=$x, b=$y")
      case CaseClass1(x) => println(s"a=$x")
      case CaseObject => println("No args")
    }
  }
}  