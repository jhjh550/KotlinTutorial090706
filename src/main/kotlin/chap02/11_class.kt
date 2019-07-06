package chap02

class MyClass{
    val name = "Hello World"
    fun sayHello(){
        println(name)
    }
}

fun main() {
    val obj1 = MyClass()
    obj1.sayHello()
}