class Point(val a: Int, val b: Int){
  var x = a
  var y = b

  def move(dx: Int, dy:Int){
    x = x + dx
    y = y + dy
    println("Here is the new point " +(x, y))
  }
}
class Location(override val a: Int, override val b: Int, val c: Int) extends Point(a,b){
  var z = c
  def move(dx: Int, dy: Int, dz: Int){
    x = x + dx
    y = y + dy   
    z = z + dz
    println("The new location is "+(x,y,z))   
  }
}

object Demo {
  def main(args: Array[String]){
    val p = new Point(5,6)
    p.move(4,4)
    val l = new Location(6, 9, 23)
    l.move(4,4,3)
  }
}