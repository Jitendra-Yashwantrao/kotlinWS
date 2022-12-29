fun main(args: Array<String>) {
    var interestingThings = listOf("kotlin", "java", "golang")
    sayGreeting("hello how are you")
    sayGreeting("hello", "kotlin", "java", "golang")

}

fun sayGreeting(greeting: String, vararg itemsToGreet: String) {
    println(greeting)
    itemsToGreet.forEach { itemTogreet -> println("$greeting - $itemTogreet") }

}

