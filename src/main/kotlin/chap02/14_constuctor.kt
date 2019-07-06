package chap02

class User21(name: String){
    init{
        println("init block $name")
    }
    constructor(name:String, age:Int) : this(name) {
        println("secondary $name $age")
    }
}

class User22(name:String){
    init { println("init block") }
    constructor(name:String, age:Int): this(name){ println("secondary 1")}
    constructor(name:String, age: Int, email: String) : this(name, age){
        println("secondary 2")
    }
}

fun main() {
    val user1 = User21("hello")
    val user2 = User21("world", 11)
    val userA = User22("hello", 1,"world")
}