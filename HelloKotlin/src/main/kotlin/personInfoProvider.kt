interface PersonInfoProvider {

    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

class BasicInfoProvider : PersonInfoProvider {
    override val providerInfo: String
        get() = "Basic provider information"

}

fun main() {

    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}