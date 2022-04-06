fun main() {
    var animal = "Dog"

//    if (animal == "Horse"){
//        println("Animal is Horse")
//    } else if (animal == "Cat"){
//        println("Animal is cat")
//    } else if (animal == "Dog"){
//        println("Animal is Dog")
//    } else{
//        println("Animal is not Found")
//    }

//    when(animal){
//        "Horse" ->  println("Animal is Horse")
//        "Cat" -> println("Animal is cat")
//        "Dog" ->  println("Animal is Dog")
//        else -> println("Animal is not Found")

    var result = when(animal){
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "Animal is not found"
    }
    println(result)

    val age = 40
    val person =  when(age) {
        in 1..10 -> "kid"
        in 12..19 -> "Teen"
        in 20..40 -> "Adult"
        in 40..100 -> "Old"
        else -> "Invalid"
    }
    println(person)
}