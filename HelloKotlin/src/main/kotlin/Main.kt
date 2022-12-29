fun main(args: Array<String>) {
    var interestingThings = arrayOf("kotlin", "java", "golang")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(1))
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }

    println(interestingThings.toString())
}

fun sayGreeting(greeting: String, textToGreet: String) = println("$greeting - $textToGreet")
