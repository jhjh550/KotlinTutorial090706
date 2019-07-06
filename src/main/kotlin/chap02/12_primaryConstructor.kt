package chap02

class MyClass1{ }
class MyClass2(){ }
class MyClass3 constructor() { }

class User1 constructor(name: String, age:Int = 0){
    val myName = name
    init {
        println("hello i'm init block $name $age")

    }
    fun sayHello(){
        println("hello $myName")
    }
}
class User2(var name: String, val age: Int){}

fun main() {
    val obj1 = MyClass1()
    val obj2 = MyClass2()
    val obj3 = MyClass3()

//    val user1 = User1()
    val user2 = User1("hello", 11)
    val user3 = User2("world", 22)
    val user4 = User1("kotlin")

//    user2.age
    user3.age

}
