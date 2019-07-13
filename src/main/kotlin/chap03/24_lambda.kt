package chap03

fun sum(x1:Int, x2:Int):Int{
    return x1+x2
}

val funValue = ::sum
val funValue2 = {x1:Int, x2:Int -> x1+x2}
val funValue5 = {x1:Int, x2:Int ->
    print("hello world")
    x1+x2
}

val funValue3 = { -> 10+20}
val funvalue4 = { 10+20 }

fun myTestFun(no:Int):Int{
    return no*10
}
fun main() {
    funValue(10,11)
    funValue2(10,11)

    val name:String = "hello"
    val lambdaFun:(Int)->Int = {x:Int->x*10}
    val lambdaFun2:(Int)->Int = {x -> x*10}
    val lambdaFun3:(Int)->Int = { it*10 }

}