package clase1

object MiModulo {

  private def miFuncion(n: Int): Int = {
    n + 1
  }

  def main(args: Array[String]): Unit = {
    println(miFuncion(10))
  }

}