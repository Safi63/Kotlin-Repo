fun main() {

    var i = 10
    var j = 12

    var result = i == 10 || j++ == 12 // second expression will not run
    println(i)
    println(j) // 12

    val text = true
    var answer = !text
    println(answer) // false
     answer = !!text
    println(answer)// true

}
