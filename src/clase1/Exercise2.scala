package clase1

object Exercise2 {

  private def areaCirculo(area: Double): Double = {
    Math.PI * Math.pow(area, 2.0)
  }

  def main(args: Array[String]): Unit = {
    println(areaCirculo(2.0))
  }

}
