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
  }
}