/**
  * Absolutely 100% sure that this is needless and just wastes my time.
  *
  * Created by paweldylag on 28/03/2017.
  */
class Board {

  var EMPTY_CHAR: String = " "
  var boardArray: Array[Array[String]] = Array.ofDim[String](3, 3)

  def init(): Unit = {
    for {
      i <- 0 until 3
      j <- 0 until 3
    } boardArray(i)(j) = EMPTY_CHAR
  }

  def makeMove(row: Int, column: Int, mark: String): Unit = {
    if (boardArray(row)(column) == EMPTY_CHAR) {
      boardArray(row)(column) = mark
    } else {
      throw new IllegalArgumentException("Field " + row + ", " + column + " is occupied!")
    }
  }


}
