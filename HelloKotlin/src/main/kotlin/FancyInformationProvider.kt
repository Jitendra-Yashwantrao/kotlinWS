class FancyInformationProvider : BasicInfoProvider() {

    override val sessionIdInfo: String
        get() = "FancySessionID"
    override val providerInfo: String
        get() = "Fancy information provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Addition Fancy Information Provider")
    }
}