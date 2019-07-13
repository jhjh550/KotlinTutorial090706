package chap02

enum class Direction(val no:Int, val str:String){
    NORTH(10, "north"),
    SOUTH(11, "south"),
    WEST(12, "west"),
    EAST(13, "east")
}

enum class Direction2{
    NORTH {
        override val data1: Int = 10
        override fun myFun() {
            println("north myFun!!!")
        }
    },
    SOUTH{
        override val data1: Int = 11
        override fun myFun() {
            println("south myFun!!!")
        }
    };
    abstract val data1: Int
    abstract fun myFun()
}

fun main() {
    val dir = Direction.WEST
    println("${dir.name} / ${dir.ordinal}")
    println("${dir.no} ${dir.str}")

    val dir2 = Direction2.NORTH
    println(dir2.data1)
    dir2.myFun()
}