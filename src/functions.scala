object Demo{
  def main(args: Array[String]){
    println("\n-------Function(without = operator) invocation-------")
    println(s"a+b = ")
    func1(3,8)

    println("\n-------Function(with = operator) invocation-------")
    println(s"a+b = ${func2(3,8)}")

    println("\n-------Function(with default param value a=100, b=100) invocation-------")
    println(s"Calling func3() a+b = ${func3()}")
    println(s"Calling func3(4) a+b = ${func3(4)}")

    println(s"Calling func3(b=6) with named param a+b = ${func3(b=6)}")
  }
  // Function without = operator
  def func1(a: Int, b: Int){
    println(a+b)
  }
  // function with = operator
  def func2(a: Int, b: Int) = {
    a+b
  }
  def func3(a: Int=100, b: Int=100)={
    a+b
  }
}