package chap02

open class MySuper(name:String){ }
class MySub(name:String): MySuper(name) {
    constructor(name:String, age:Int): this(name){}
}

open class MySuper2(name:String){
    init{ println("super init block")}
    constructor(name:String, no:Int) : this(name) {
        println("super secondary constructor")
    }
}
class MySub2: MySuper2{
    init { println("sub2 init")    }
    constructor(name:String) : super(name) {}
    constructor(name:String, no:Int): super(name, no){
        println("sub2 secondary constructor")
    }
}
fun main() {
    val sub = MySub("sub class")
    val sub2 = MySub("name", 12)

    val sub3 = MySub2("hello", 11)
}