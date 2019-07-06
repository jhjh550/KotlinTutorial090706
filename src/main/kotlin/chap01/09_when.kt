package chap01

fun main() {

    val a = 1
    when(a){
        1 -> println("a == 1")
        2 -> println("a == 2")
        else -> {
            println("a is not 1,2")
        }
    }
    val b = "hello"
    when(b){
        "hello"->{ println("hello")}
        "world"->{ println("world")}
    }
    when(a){
        10,20 -> {}
        30+30 -> {}
//        somefun() -> {}
        in 100..200 -> {}
//        in list -> {}
//        in array -> {}
    }

    val result = when(a){
        1 -> "value is 1"
        2 -> "value is 2"
        else -> {
            println("hello else")
            "hello"
        }
    }
    println(result)
}