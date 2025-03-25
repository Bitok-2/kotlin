import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number :")
    var numb = read.nextInt()

    println("Enter second number:")
    var num = read.nextInt()

    println("Enter function : + - * /")
    var function= readln()

    var result = when(function){
        "+" -> println("The result is ${numb + num}")
        "-" -> println("The result is ${numb - num}")
        "*" -> println("The result is ${numb * num}")
        "/" -> println("The result is ${numb / num}")


        else -> "Invalid function"

    }


}