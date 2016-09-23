import scala.io.Source

object Main0311 {
  def main(args: Array[String]) {
    def widthOfLength(s: String) = s.length.toString.length

    // TODO ‚È‚ñ‚ÅgetLines‚ÍŠ‡ŒÊ‚ª•K—v‚È‚ÌH
    val lines = Source.fromFile("src/main/scala/Main0311.scala").getLines().toList
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpace = maxWidth - widthOfLength(line)
      val padding = " " * numSpace
      println(padding + line.length + " | " + line)
    }
  }
}
