package chap02

class Outer{
    var no:Int = 10
    inner class Nested{
        val name = "hello world"
        fun myFun(){
            println("nested my fun ${no}")
            no = 20
        }
    }
}

fun main() {
//    val obj = Outer.Nested()
//    obj.myFun()
}