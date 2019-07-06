package chap01

fun main() {
    var array = arrayOf(1,2,4,"hello", "world")
    println(array[4])
    array[2] = 100
    println("size: ${array.size}, 1st item:${array.get(0)}")

    var arrayInt = arrayOf<Int>(10,20,30)
    var arrayInt2 = IntArray(3)

    // LIST
    val immutableList:List<String> = listOf("hello", "world")
    val mutableList:MutableList<String> = mutableListOf("oracle", "java")

    mutableList.add("123")
    mutableList.add(1,"qqq")
    println(mutableList.get(0))
    println(mutableList.get(1))
    println(mutableList.get(2))

    // MAP
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("one", "hello")
    mutableMap["two"] = "world"
    println(mutableMap.get("one"))
    println(mutableMap["two"])

    // SET
    val mutableSet = mutableSetOf<String>()
    mutableSet.add("(set)hello")

    println(mutableSet.elementAt(0))



 }