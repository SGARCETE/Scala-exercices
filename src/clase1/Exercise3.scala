package clase1

object Exercise3 {

  private def printWithRecursiveMethod(n: Int): Unit = {
    println(n)
    if(n<50) printWithRecursiveMethod(n+5) else n
  }

  def main(args: Array[String]): Unit = {
    println(printWithRecursiveMethod(5))
  }

}
