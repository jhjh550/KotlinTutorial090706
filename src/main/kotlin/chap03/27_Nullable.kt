package chap03

fun main() {
    var data1: String? = "hello world"
    var length1: Int?

    length1 = data1?.length
    val length2 = length1 ?: 0

    val intValue: Int? = data1 as? Int
    println(intValue)

    println(length2)
}