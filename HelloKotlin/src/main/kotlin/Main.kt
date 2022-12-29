fun main(args: Array<String>) {
    var interestingThings = arrayOf("kotlin", "java", "golang")
    sayGreeting("hello how are you")
    sayGreeting("hello", "kotlin", "java", "golang")
    sayGreeting("spread operator", *interestingThings)

    greetPerson(name = "jitendra", greeting = "Awesome")
    greetPerson()
    greetPerson("hello", "kayuar")
}

fun greetPerson(greeting: String = "hello", name: String = "Kotlin") {
    println("$greeting - $name")
}

fun sayGreeting(greeting: String, vararg itemsToGreet: String) {
    println(greeting)
    itemsToGreet.forEach { itemTogreet -> println("$greeting - $itemTogreet") }

}

