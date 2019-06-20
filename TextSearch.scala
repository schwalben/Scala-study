object TextSearch extends App { 
  
  val text: String = "あえいうえおあいうえおあおいあうえおおあいうえおあいうおあいえおあい"
  val pattern: String = "あいうえお"
  val simpleMatchIndexes: Seq[Int] = search(text.toSeq, pattern.toSeq)
  println(s"出現場所(非索引型検索): ${simpleMatchIndexes}")

  val regexMatchIndexes: Seq[Int] = regexSearch(text, pattern)
  println(s"出現場所(正規表現): ${regexMatchIndexes}")
  

  def search(text: Seq[Char], pattern: Seq[Char]): Seq[Int] = {
    var matchIndexes = Seq[Int]()
    for (i <- 0 to text.length - 1) {
      val partText = text.slice(i, i + pattern.length)
      if (isMatch(partText, pattern)) matchIndexes = matchIndexes :+ i
    }
    return matchIndexes
  }

  def isMatch(textPart: Seq[Char], pattern: Seq[Char]): Boolean = {
    for (i <- 0 to pattern.length - 1) {
      if (textPart.length < pattern.length || textPart(i) != pattern(i)) {
        return false
      }
    }
    return true
  }

  def regexSearch(text: String, pattern: String): Seq[Int] = {
    return pattern.r.findAllIn(text).matchData.map(_.start).toList
  }
}
