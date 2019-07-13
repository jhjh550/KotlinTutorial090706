package chap03

class MySuper{
    val value: Int = 10
    fun mySuperFun(){
        println("mySuperFun!!!")
    }
}
val MySuper.subValue: Int
    get() = 20

fun MySuper.subFun(){
    println("sub fun")
}
fun main() {
    val obj = MySuper()
    obj.subFun()
}