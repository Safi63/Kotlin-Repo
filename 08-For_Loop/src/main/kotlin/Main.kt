fun main(args: Array<String>) {

        for(i in 1..5){
            println(i)
        }
        println(" ")

    for (i in 1..5 step 2){
            println(i)
        }
         println(" ")

    for (i in 1 until 5){
            println(i)
        }
         println(" ")

    for (i in 10 downTo 1 step 2){
            println(i)
        }

    println("Printing table of 2")
    var num = 2
    for (i in 1..10){
        println("$num x $i = ${num*i} ")

    }
}