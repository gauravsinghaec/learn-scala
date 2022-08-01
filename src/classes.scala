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

object Demo{
  def main(args:Array[String]){
    val Car = new Vehicle()
    println(Car.vehicleType)

    println("\n-------- Primary Constructor--------")
    val van1 = new VehiclePrimCons(10, 30)
    val van2 = new VehiclePrimCons(2,3)
    println(van1.location)
    println(van2.location)
  }
}