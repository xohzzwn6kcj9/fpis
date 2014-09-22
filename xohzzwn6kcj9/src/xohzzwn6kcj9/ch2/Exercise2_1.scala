package xohzzwn6kcj9.ch2

object Exercise2_1 {

  def fib(n: Int): Int = {
    def go(a: Int, b: Int, n: Int): Int = {
      if (n == 1) {
        a
      } else if (n == 2) {
        b
      } else {
        go(b, a + b, n - 1)
      }
    }
    go(0, 1, n);
  }

  def main(args: Array[String]) {
	  println(fib(3))
	  println(fib(4))
	  println(fib(5))
	  println(fib(6))
	  println(fib(7))
  }

}