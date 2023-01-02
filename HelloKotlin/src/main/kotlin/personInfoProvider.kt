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

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    protected open val sessionIdInfo: String = "basicsessionid"
    override fun getSessionId(): String {
        println(sessionIdInfo)
        return sessionIdInfo
    }

    override val providerInfo: String
        get() = "Basic provider information"

    override fun printInfo(person: Person) {
        // super.printInfo(person)
        println("overriding abstract interface implementation inside basic info provider ")
    }

}

fun main() {

//    val provider = BasicInfoProvider()
    //   val provider = FancyInformationProvider()
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New info provider"

        fun getSessionId() {
            println("anonymous session ID")
        }

    }
    provider.printInfo(Person())
    provider.getSessionId()
    checkType(provider)
}

fun checkType(personInfoProvider: PersonInfoProvider) {

    if (personInfoProvider is SessionInfoProvider) {
        println("provider is session info providr")
        personInfoProvider.getSessionId()
    } else {
        println("provider is not session info provider")
    }
}