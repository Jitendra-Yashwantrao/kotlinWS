interface PersonInfoProvider {

    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    override fun getSessionId(): String {
        println("basic session id")
        return "basicsessionid"
    }

    override val providerInfo: String
        get() = "Basic provider information"

    override fun printInfo(person: Person) {
        // super.printInfo(person)
        println("overriding abstract implementation completely")
    }

}

fun main() {

    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    provider.getSessionId()
}