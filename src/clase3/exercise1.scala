package clase3

object exercise1 {

  def main(args: Array[String]): Unit = {
    val max = (x: Int, y: Int) => if(x>y) x else y
    def elegir(t: (Int, Int, Int), cmp: (Int, Int) => Int): Int = cmp(t._1, cmp(t._2, t._3))
    println(elegir( (14, 7, 9), max ))
  }


}
