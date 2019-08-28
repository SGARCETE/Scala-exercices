package clase2

object exercise1 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, anterior: Int, actual: Int): Int =
      if (n == 0) anterior
      else loop(n - 1, actual, anterior + actual)
    loop(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(3))
  }
}
