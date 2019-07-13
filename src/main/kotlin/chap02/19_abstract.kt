package chap02

abstract class AbstractTest1{
    fun myFun(){ }
    abstract fun myFun2()

    val data1:String = "hello world"
    abstract val data2:String
}

interface MyInterface{
    fun myFun1()
    fun myFun2(){ }
    var data1:String
}

class MyClassImpl: MyInterface {
    override fun myFun1() {

    }
    override var data1: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

}