package chap01

fun main() {
    val result = sum(1,2)
    print(result)
}

fun sum(a:Int, b:Int):Int{
    var sum = 0
    fun calSum(){
       sum = a+b
    }
    calSum()
    return sum
}

fun some(a:Int, b:Int) = a + b