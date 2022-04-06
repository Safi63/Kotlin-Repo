import kotlin.math.pow

fun main(args: Array<String>) {

    println(add(a = 2,b = 2)) //named arguments
    println(add(b = 2.0,a = 3.0))
    var fn = :: addition // storing function in a variable
    println(fn(3,3))

    var fnn = ::power
    println(fnn(3.0,2.0))
}

//method overloading
fun add(a: Int , b: Int): Int{
    return a+b
}
fun addition(a: Int , b: Int): Int{
    return a+b
}
fun add(a: Double , b: Double): Double{
    return a+b
}
fun power(a: Double , b: Double): Double{
    return a.pow(b)
}
