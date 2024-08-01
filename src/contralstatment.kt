fun main(args: Array<String>) {
    var age = 17

    if (age >= 13) {
        println("You are eligible to vote")

    } else {
        println("Sorry you cant vote")
    }
    var num = 3
    if (num % 2 == 0) {
        println("$num is even number")
    } else {
        println("$num is odd number")
    }
    var marks = 70

    if (marks >= 80 && marks <= 100) {
        println("You scored an A")
    }else if (marks>=60 && marks<=79) {
        println("You have a B")
    }else if (marks>=40 && marks<=59){
        println("yOU HAVE c")

    }else if (marks>=0 && marks<=39) {
        println("You failed")
    }else{
        println("Wrong input")
    }

}

