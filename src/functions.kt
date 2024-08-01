fun mayclass(){

    var name="emobilis"
    println("i learn coding at $name")
}
fun main(args: Array<String>) {
    mayclass()
    addtwonumber()
    students("tom","john",24)
    students("Alex","Wayne",54)

}
fun addtwonumber(){
    var num1=7
    var num2=9
    println("The sum of $num1 and $num2 is ${num1+num2}")
}

fun students(fname:String,lname:String,age:Int){

    println("student name is $fname and he/she is $age years old")
}