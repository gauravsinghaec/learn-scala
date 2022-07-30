class Point(a: Int, b: Int){
  var x = a
  var y = b

  def move(dx: Int, dy:Int){
    x = x + dx
    y = y + dy
  }
}

object Demo {
  def main(args: Array[String]){
    val p = new Point(5,6)
    p.move(4,4)
    println("Here is the new point " +(p.x, p.y))
  }
}