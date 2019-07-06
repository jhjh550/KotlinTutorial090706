package chap01

fun main() {
    for (i in 1..10 step 2){
        println(i)
    }
    for(i in 91 until 100 step 2){
        println(i)
    }
    for(i in 10 downTo 1 step 2){
        println(i)
    }
    val list = listOf("String", "World")
    for(str in list){
        print(str)
    }
}