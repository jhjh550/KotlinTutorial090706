package chap01

fun main() {
    val intData:Int = 10

    val str1 = "Hello\nworld"
    val str2 = """Hello
World"""

    print(str2)
    println("result: $intData")
    println("result: ${intData+1}")
    println("sum: ${sum(10,11)}")

    println(getLength("Hello World"))
    println(getLength(100))
}

// Any type
fun getLength(obj: Any):Int{
//    val strData:String = obj

    if(obj is String){
        return obj.length
    }
    return 0
}