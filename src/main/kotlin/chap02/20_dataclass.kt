package chap02

class Product(val name:String, val price:Int)
data class User(val name:String, val age:Int)

fun main() {
    val product1 = Product("p1", 100)
    val product2 = Product("p1", 100)
    println(product1.equals(product2))
    println(product1)

    val user1 = User("hello", 20)
    val user2 = User("hello", 20)
    println(user1.equals(user2))
    println(user1.toString())
    println(user1.component2())
    val user3 = user1.copy(name="world")
    println(user3.toString())
}


