package chap02

val obj1 = object {
    var no: Int = 10
    fun myFun(){
        print("hello world")
    }
}

open class SomeClass{
    fun someClassFun(){
        println("someClass fun!!!")
    }
}
interface SomeInterface{
    fun someInterfaceFun()
}
val myValueObj: SomeClass = object: SomeClass(), SomeInterface{
    override fun someInterfaceFun() {
        println("some interface fun!!")
    }
}

class MyClass23{
    companion object {
        fun myFun(){
            println("companion myFun")
        }
    }
}

fun main() {
    MyClass23.myFun()
}