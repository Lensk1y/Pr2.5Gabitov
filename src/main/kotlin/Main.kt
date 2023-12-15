fun main(args: Array<String>) {
    val inputArray = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val groupedWords = inputArray.groupBy { it.toCharArray().sorted().joinToString() }
    for ((key, value) in groupedWords) {
        println("Words with the same letters: $value")
    }
}