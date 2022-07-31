import scala.util.control.Breaks._

object Demo{
	def main(args: Array[String]){
		val x = 1000L
		val y = 2.1D
		val z = 3.24F
		println(x,y,z)
		
		val multiStr = """This is my practice code for learning Scala.
It will take some time."""
		println(multiStr)

		println(s"y.abs = ${y.abs}")

    println("--------if-else--------")
		// Below code is an example of everything in scala is an expression and 
		// returns a value 
		var v = 
		if (x >500 && x < 600) {
			println("x is less")
			println("x is more less")
			1
		}
		else if (x < 600){
			println("x is between 500 & 600")
			2
		}
		else {
			3
		}
		println(v)
		
    println("--------Using for loop & List--------")
    // for with filters
    val nums = List(23,23,1,5,9,14,3)
    println("Nums within limts are")
    var t = for (x <- nums
      if x>5; if x<20 ){
      println(x);
    }
    println(t) // -> ()
    
    println("--------Using for loop with guard/filter--------")
    var retVal = for{ i <- nums if i>10 ; if i<20} yield i
    println("retVal of loop "+ retVal) // -> List(14)
    
    println("--------Using foreach loop--------")
    // For each in the List
    var i = 1
    nums.foreach((n: Int)=>{
      println(s"Here is ${i} element in num list: ${n}")
      i = i+1
    })
    println("--------Using by keyword in for loop--------")
    // For loop using "by" keyword
    // By 2 keyword is used to skip all the even iteration here
    for (i <- 1 to 10 by 2){
      println(i)
    }

    // Using break method
    println("--------Using break method--------")
    breakable{
      for (i <- 10 to 20 by 2){
        if(i==17){
          println(i)
          break
        }
      }
    }
    println("--------Matching--------")
    // Matching in scala
    x match{
      case 1000 => println("Got the match")
      case 500 => println("Got differen match")
      case _ => println("Opps")
    }
    println("--------Matching with function--------")
    search("x")
  }
  def search(str:String) = str match { 
    case "Alexa" => println("Saying alexa")
    case "Google" => println("saying goodle")
    case _ => println("Didn't hear anything")
  }
}