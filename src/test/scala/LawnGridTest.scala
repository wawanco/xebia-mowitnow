import org.scalatest.FlatSpec

class LawnGridTest extends FlatSpec {

  "LawGrid" should "contains inside position" in {
    val lawn = LawnGrid(3, 3)
    assert(lawn.contains(Coordinate(0, 0)))
    assert(lawn.contains(Coordinate(1, 0)))
    assert(lawn.contains(Coordinate(2, 0)))
    assert(lawn.contains(Coordinate(0, 1)))
    assert(lawn.contains(Coordinate(1, 1)))
    assert(lawn.contains(Coordinate(2, 1)))
    assert(lawn.contains(Coordinate(0, 2)))
    assert(lawn.contains(Coordinate(1, 2)))
    assert(lawn.contains(Coordinate(2, 2)))
  }

  "LawGrid" should "not contains inside position" in {
    val lawn = LawnGrid(3, 3)
    assert(!lawn.contains(Coordinate(-1, -1)))
    assert(!lawn.contains(Coordinate(0, -1)))
    assert(!lawn.contains(Coordinate(0, 3)))
    assert(!lawn.contains(Coordinate(3, 0)))
    assert(!lawn.contains(Coordinate(4, 4)))
  }

}
