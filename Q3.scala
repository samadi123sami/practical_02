package prac02_22001816

object Q3 {
  def main(args: Array[String]): Unit = {
    val normalRS = 250
    val OTRS = 85
    val normalH = 40 //pays all its employees Rs.250 per normal working hour and Rs. 85 per OT hour
    val OTH = 30
    val tax = 0.12

    def take_home_salary():Unit = {
      val normalS = normalRS * normalH
      val OTS = OTRS * OTH
      val salary = normalS + OTS
      val TakeHomeSalary = salary - (salary * tax)
      println(TakeHomeSalary)
    }

    take_home_salary()

  }
}
