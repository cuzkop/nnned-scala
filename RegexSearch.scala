object RegexSearch extends App {
    val text = "カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ"
    val pattern = "ドワンゴ"
    val matchIndexes = pattern.r.findAllIn(text).matchData.map(_.start).toList
    println(matchIndexes)
}