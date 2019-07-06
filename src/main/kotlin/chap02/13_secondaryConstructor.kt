package chap02

class User11{ } //
class User12(name: String){ } // primary constructor

class User13{
    constructor(name: String){}
}
class User14(name: String){
    constructor(name: String, age:Int) : this(name){}
}
// 생성자 오버로딩
class User15{
    constructor(){}
    constructor(name:String){}
    constructor(name:String, age:Int){}
    constructor(temp:Int){}
}

class User16{
    init {
        println("i'm init block")
    }
    constructor(name: String){
        println("i'm constructor $name")
    }
}
fun main() {
    val userA = User12("hello")
    val userB = User13("world")
    val userC = User14("hello", 14)
    val userD = User16("1212")
}