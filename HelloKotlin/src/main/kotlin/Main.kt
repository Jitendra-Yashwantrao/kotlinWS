fun main(args: Array<String>) {
    var interestingThings = arrayOf("kotlin", "java", "golang")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(1))
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }

    println("other way")

    interestingThings.forEach {
        println(it)
    }

    println("one more way")

    interestingThings.forEach { interestingThings -> println(interestingThings) }

    println("one more way to print index")

    interestingThings.forEachIndexed { index, interestingThing -> println("$interestingThing is at index $index") }
}

fun sayGreeting(greeting: String, textToGreet: String) = println("$greeting - $textToGreet")
