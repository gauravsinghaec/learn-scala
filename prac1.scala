object practice1{
	def main(args: Array[String]){
		val x = 1000L
		val y = 2.1D
		val z = 3.24F
		println(x,y,z)
		
		val multiStr = """This is my practice code for learning Scala.
It will take some time."""
		println(multiStr)

		println(s"y.abs = ${y.abs}")

		// Below code is an example of everything in scala is an expression and 
		// returns a value 
		val v = 
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

	}
}