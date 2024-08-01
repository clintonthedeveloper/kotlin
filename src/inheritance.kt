open class parent{
    var dad="like watching football"
    var mum="Likes shopping"

}
class daughter:parent(){
    fun da(){
        println("mum $mum ")
    }

}
class son:parent() {
    fun so() {
        println("Dad $dad")
    }
}

fun main(args: Array<String>) {
    val obj=daughter()
    obj.da()
    val obj2=son()
    obj2.so()
}

