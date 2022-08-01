class Vehicle{
  val vehicleType: Int = 0
  var positionX: Int = 0
  var positionY: Int = 0
  def move(dx: Int, dy: Int){
    positionX = positionX +dx
    positionY = positionY +dy
  }
}

object Demo{
  def main(args:Array[String]){
    val Car = new Vehicle()
    println(Car.vehicleType)
  }
}