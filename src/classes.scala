class Vehicle{
  val vehicleType: Int = 0
  var positionX: Int = 0
  var positionY: Int = 0
  def move(dx: Int, dy: Int){
    positionX = positionX +dx
    positionY = positionY +dy
  }
}

class VehiclePrimCons(positionX:Int, positionY: Int){
  def location() = {
    (positionX,positionY)
  }
}

object SingletonObject{
  def add2(in: Int) ={
    in+2
  }
}
class Demo{
  def show(){
    println("Inside companion class")
  }
}

class Overloading {
  def add(x: Int,y: Int) = {
    x+y
  }
  def add(x: Int,y: Int,z: Int) = {
    x+y+z
  }
}

class ThisExample1{
  var positionX: Int = 0
  var positionY: Int = 0
  
  // This is auxiliarry constructor
  def this(x: Int, y: Int) {
    this() // This will invoke the primary constructor which should always be first statement inside auxiliary constructor
    this.positionX = x
    this.positionY = y
  }
}

class ThisExample2(name: String){
  def this(name: String, age: Int) {
    this(name) // This will invoke the primary constructor which should always be first statement inside auxiliary constructor
    println(s"name = ${name} and age = ${age}")
  }
}

class A {
  var x = 10
}
class B extends A {
  var y = 6
}
class C extends B {
  var z = 121
}

object Demo{
  def main(args:Array[String]){
    val Car = new Vehicle()
    println(Car.vehicleType)

    println("\n-------- Primary Constructor--------")
    val van1 = new VehiclePrimCons(10, 30)
    val van2 = new VehiclePrimCons(2,3)
    println(van1.location)
    println(van2.location)

    println("\n--------Anonymous Object--------")
    println(new VehiclePrimCons(12,30).location)

    println("\n--------Singleton Object--------")
    println(SingletonObject.add2(42))

    println("\n--------Companion Object--------")
    println("Inside companion object")
    new Demo().show()
    println("\n--------Method overloading--------")
    val newObject = new Overloading()
    println(newObject.add(12,56))
    println(newObject.add(34,12,56))

    println("\n--------primary/auxiliarry constructor--------")
    var ex1 = new ThisExample1(2,5)
    println(ex1.positionY)
    
    println("\n--------calling 1 constructor from other--------")
    var ex2 = new ThisExample2("Gaurav", 32)

    println("\n--------Multilevel Inheretence--------")
    val c = new C()
    println(c.x,c.y,c.z)
  }
}