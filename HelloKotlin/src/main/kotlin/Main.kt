fun main(args: Array<String>) {
    var interestingThings = arrayOf("kotlin", "java", "golang")
    sayGreeting("hello how are you")
    sayGreeting("hello", "kotlin", "java", "golang")
    sayGreeting("spread operator", *interestingThings)

}

fun sayGreeting(greeting: String, vararg itemsToGreet: String) {
    println(greeting)
    itemsToGreet.forEach { itemTogreet -> println("$greeting - $itemTogreet") }

}

