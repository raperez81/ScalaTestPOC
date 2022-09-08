package sample

object Calculator extends App{
  def apply(expr: String): Int = {
    val exprArray = expr.split(" ").map(_.trim)
    val firstNumber = exprArray(0).toInt
    val op = exprArray(1)
    val secondNumber = exprArray(2).toInt
    val result = op match {
      case "+" =>
        Sum(firstNumber, secondNumber)
    }

    result
  }
}
