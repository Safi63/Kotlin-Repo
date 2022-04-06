fun main() {

    val above70 = true
    val knowsProgramming = false

    var callForJob = above70 && knowsProgramming
    println(callForJob) // false

    callForJob = above70 || knowsProgramming
    println(callForJob) // true
}
