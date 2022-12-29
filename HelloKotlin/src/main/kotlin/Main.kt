fun main(args: Array<String>) {
    sayGreeting("hell", "world")
    sayGreeting("Hey", "kotlin")
}

fun sayGreeting(greeting: String, textToGreet: String) = println("$greeting - $textToGreet")
