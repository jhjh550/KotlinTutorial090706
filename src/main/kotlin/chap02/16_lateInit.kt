package chap02

class User41{
    val data: String
    val data2: Int
    var name1: String?
    lateinit var myData:String
    val myData2: Int by lazy {
        println("this is myData2")
        123
    }


    init {
        data = "hello"
        data2 = 123
        name1 = null
    }
}