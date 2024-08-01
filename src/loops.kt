// for loop
fun main(args: Array<String>) {
    var myarray= arrayOf("Toyota","mazda","t",56,)

    for (i in myarray){
        println("print $i")
    }
//    range
    for(x in 5 .. 15){
        println("Range is "+x)
    }
// character
    for( ch in 'D' .. 'K'){
        println(ch)
    }
}
