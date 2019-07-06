package chap01

fun main() {
    val a = 5
    val result = if(a>10) "hello" else "world"
    println(result)
    // error in kotlin
//    val temp = a > 5 ? "hello" : "world"

    val result2 = if (a<10){
        print("hello....")
        10 + 20
    }else{
        print("world...")
        20 + 20
    }
}