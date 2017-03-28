/**
  * Probably no one ever gonna read this. The world is so empty, yet so crowded.
  *
  * Created by paweldylag on 28/03/2017.
  */
trait Player {

  def getName(): String
  def makeNextMove(board: Board): Unit

}
