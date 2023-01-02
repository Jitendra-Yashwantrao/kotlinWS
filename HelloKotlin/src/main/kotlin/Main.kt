fun main(args: Array<String>) {
    val person = Person("Jeet", "yash")

    person.firstName
    person.lastName
    person.nickName = "yashwant"

    var person2 = Person()
    //person2.firstName = "jyoti"
    person.printInfo()
    person2.printInfo()


}


