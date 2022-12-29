fun main(args: Array<String>) {
    var interestingThings = arrayOf("kotlin", "java", "golang")

    var abcmap = mapOf(1 to "a", 2 to "b", 3 to "c")

    abcmap.forEach { key, value -> println("$key -> $value") }

    println(abcmap)

}

fun sayGreeting(greeting: String, textToGreet: String) = println("$greeting - $textToGreet")
