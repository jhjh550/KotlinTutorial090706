package chap03

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.SOURCE)
annotation class MyAnnotation(val count:Int)

//@MyAnnotation
class MyTestClass{
    @MyAnnotation(3)
    fun myFun(){}

    @get:MyAnnotation(5)
    val myVal: String = "hello world"
}

fun main() {
    val obj = MyTestClass()
    val methods = MyTestClass::class.java!!.methods
    for(method in methods){
        if(method.isAnnotationPresent(MyAnnotation::class.java)){
            val annotation = method.getAnnotation(MyAnnotation::class.java)
            val count = annotation.count
        }
    }

}