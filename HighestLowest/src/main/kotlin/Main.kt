fun main() {
    val input = readLine()!!.split(" ")
    input.map { i -> i.toInt() }.toList()
    println(input.maxOrNull() ?: 0)
    println(input.minOrNull() ?: 0)
}