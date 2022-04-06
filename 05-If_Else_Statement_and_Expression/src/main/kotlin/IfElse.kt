fun main() {

    val isRaining = false
    if (isRaining == true){
        println("Take Umbrella")
    } else {
        println("Enjoy your day")
    }

    var x = 5
    var y = 6
    if (x > y){
        println("X is grater than y")
    } else if (x < y){
        println("X is less than Y")
    } else {
        println("X is equal to Y")
    }

    // If Else as an expression
    var result = if (x > y){
        "X is grater than y"
    } else if (x < y){
        "X is less than Y"
    } else {
        "X is equal to Y"
    }
    println("This is If Else Expression: "+result)

    var a = 20
    var ans = if (a%2 == 0) "Even" else "Odd"
    println(ans)
}