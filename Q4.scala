package prac02_22001816

object Q4 {
  def main(args: Array[String]): Unit = {
      val TicketPrice = Array(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)

      val attendees = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
      val profit = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

      for (i <- TicketPrice.indices) {
        attendees(i) = 120 + (15 - TicketPrice(i)) / 5 * 20
      }

      for (i <- profit.indices) {
        profit(i) = (attendees(i) * TicketPrice(i)) - (500 + 3 * attendees(i))
      }

      //calculate highest profit
      var max = profit(0)
      var k = 0
      for (i <- profit.indices) {
        if (profit(i) >= max) {
          max = profit(i)
          k = i
        }
      }

    println("the higher profit is " + max + " if attende " + attendees(k) + " and ticket price is " + TicketPrice(k))

  }
}


