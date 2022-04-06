fun main() {
    val a = 5
    var b = a in 1..5 // uper bound included
    println(b) // true
    b = a in 1 until 5 // uper bound not included
    println(b) //false
}