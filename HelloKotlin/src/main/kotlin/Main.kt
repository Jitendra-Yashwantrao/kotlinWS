var name: String? = "Jitendra"


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    when (name) {
        "test" ->
            println("name: ${name} ")

        "jitendra" ->
            println("jitendra case")

        else ->
            println("case not found")
    }

    println(getGreeting())
}

fun getGreeting() = "hello"