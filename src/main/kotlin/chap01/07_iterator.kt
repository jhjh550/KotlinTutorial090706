package chap01

fun main() {
    val list1 = listOf<String>("hello", "world", "oracle", "java")
    val iterator = list1.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }

    val map = mapOf<String, String>(
        "one" to "hello",
        "two" to "world")
    val iteratorMap = map.iterator()
    while (iteratorMap.hasNext()){
        val entry = iteratorMap.next()
        println("${entry.key} / ${entry.value}")
    }
}