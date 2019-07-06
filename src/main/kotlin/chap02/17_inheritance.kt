package chap02

open class MyShape{
    lateinit var name:String
    var x:Int = 0
        set(value){ field = if(value<0) 0 else value }

    open var y:Int = 0
        set(value){ field = if(value<0) 0 else value }

    open fun myPrint(){
        println("$name : location: $x, $y")
    }
}

class MyRect: MyShape() {
    override var y: Int = 100

    override fun myPrint() {
        println("not call super myPrint")
    }
}