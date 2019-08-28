package clase2

object exercise2 {
  def diferencia(src: (Int, Int), dest: (Int, Int)): (Int, Int) = {
    (dest._1 - src._1, dest._2 - src._2)
  }

  def main(args: Array[String]): Unit = {
    println(diferencia((4, 9), (122, 27)))
  }
}
