package chap03

val result = run {
    println("function call")
    10+20
}

class User{
    var name: String? = null
    var age: Int? = null
    fun sayHello(){
        println("i am $name, $age years old")
    }
}

fun main() {
    fun myTestFun(){ }
    fun myTestFun2(userParam:User){
        println("myTestFun2 ${userParam.name}")
    }
    val user = User()

    user.name = "kotlin"
    user.age = 11
    user.sayHello()

    val result = user.run {
        name = "java"
        age = 12
        sayHello()
        10 + 20
    }
    println(result)

    val user2 = user.apply {
        name = "hello"
        age = 13
        sayHello()
    }
    print(user2.name)

    user2.let{
        myTestFun2(it)
    }

    with(user2){
        name = "oracle"
        age = 99
        sayHello()
    }
}