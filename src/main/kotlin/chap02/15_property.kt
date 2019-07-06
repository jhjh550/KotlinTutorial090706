package chap02

class User31{
    var name:String = "hello"
        get() = field.toUpperCase()
        set(value) { field = "this is "+value}

    var age: Int = 20
        get() = field
        set(value){
            if(value>0)
                field = value
            else
                field = 0
        }
}

fun main() {
    val user = User31()
    user.name = "world"
    println(user.name)

    user.age = -11
    println(user.age)
}