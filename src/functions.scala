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

    println("\n-------HOF-------")
    println(s"hof(23, increaseBy10) = ${hof(23, increaseBy10)}")

    println("\n-------HOF Composition-------")
    println(s"increaseBy10(multiplyBy2(11)) = ${increaseBy10(multiplyBy2(11))}")

    println("\n-------HOF Currying 1-------")
    println(s"hofCurrying(4)(11) = ${hofCurrying(4)(11)}")
    println("\n-------HOF Currying 2-------")
    var newF = hofCurrying(34)_
    println(s"newF(7)=hofCurrying(34)_ = ${newF(7)}")
    
    println("\n-------Anonymous/Lambda functions-------")
    var result1 = (_: Int)+(_: Int)
    var result2 = (a: Int,b: Int) => a+b
    println(s"The result of result1=(_: Int)+(_: Int) = ${result1(34,2)}")
    println(s"The result of result2=(a: Int,b: Int) => a+b = ${result2(34,2)}")
    
    println("\n-------Multiline expression-------")
    println(multilineExp1(5,8))
    println(multilineExp2(5,8))
    // multilineExp3(5,8)
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
  def hof(a: Int, f: Int=> Int) ={
    f(a)
  }
  def increaseBy10(n: Int) = {
    n+10
  }
  def multiplyBy2(m: Int) = {
    m*2
  }
  def hofCurrying(m: Int)(n: Int) = {
    m+n
  }
  def multilineExp1(a: Int, b: Int) = {
    a+
    b
  }

  def multilineExp2(a: Int, b: Int) = {
    (a
    +b)
  }
  //Below one will fail as this is not the right way
  /*
  def multilineExp3(a: Int, b: Int) = {
    a
    +b
  }
  */
}