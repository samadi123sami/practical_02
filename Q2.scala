package prac02_22001816

object Q2 {

  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g= 0

    def resultA(): Unit = {
      b -= 1
      println(b * a +c * d);
      d -= 1
    }

    def resultB(): Unit= {
      println(a)
      a += 1
    }

    def resultC(): Unit = {
      println(-2 * (g - k) + c)
    }

    def resultD(): Unit = {
      println(c)
      c += 1
    }

    def resultE(): Unit = {
      c += 1
      println(c * a)
      a += 1
    }

    resultA()
    resultB()
    resultC()
    resultD()
    resultE()

  }
}

