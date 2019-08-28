package clase3

object exercise2 {

  def main(args: Array[String]): Unit = {
    def fsup(x: Int) = (y:Int) => {x * y}
    println(fsup(1) (4))
  }

}
