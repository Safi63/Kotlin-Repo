fun main(args: Array<String>) {

    var i = 10

    ++i // pre increment //
    println(i) // 11

    --i // pre decrement
    println(i) // 10

    i++ // post increment
    println(i) // 11

    i-- // post decrement
    println(i) // 10

    var a = 5

    println( a++) // answer 5 ... post increment uses value before increment
    println(a) //  answer 6
    println(++a) //  answer 7 ... pre increment uses value after increment

}