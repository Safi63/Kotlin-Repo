fun main(args: Array<String>) {
   var answer =  multiply(2,2)
    println(answer)
    evenOdd(12)
    evenOdd(13)
    message(3)
}

//fun multiply(num1: Int , num2: Int): Int
//{
//     return num1 * num2
//}
//fun multiply(num1: Int , num2: Int): Int = num1 * num2

fun multiply(num1: Int , num2: Int) = num1 * num2


fun evenOdd(num : Int){
    val result = if (num %2 == 0) "Even" else "Odd"
    println(result)
}

fun message(count: Int = 2){
    for(i in 1..count){
        println("Hello $i")
    }
}