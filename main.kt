fun main() {
    val list = MutableList(read()) { read() }
    var count = 0
    for (i in 0 until list.size - 2) {
        if (list[i] + 1 == list[i+1] && list[i] + 2 == list[i+2]) ++count
    }
    println(count)
}

fun read() = readLine()!!.toInt()
