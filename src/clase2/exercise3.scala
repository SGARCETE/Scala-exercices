package clase2

object exercise3 {
  def stringify[A,B,C](t: (A,B,C)): (A,String,B,String,C,String) = {
    (t._1, t._1.toString, t._2, t._2.toString, t._3, t._3.toString)
  }

  def main(args: Array[String]): Unit = {
    println(stringify(1, 'c', true))
  }
}
