package chap03

fun normalFun(x1:Int, x2:Int):Int{
    return x1+x2
}
fun hoFun(x1:Int, argFun:(Int,Int)->Int){
    val result = argFun(10,11)
    println("x1: $x1 result: $result")
}

fun main() {
    hoFun(123, {x1 ,x2 -> x1 + x2})
    hoFun(1, {x1,x2->x1*x2})
    hoFun(1) { x1, x2->x1*x2}
}