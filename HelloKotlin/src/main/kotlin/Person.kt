class Person(val firstName: String, val lastName: String) {

    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field;
        }

    init {
        println("init 1")
    }

    constructor() : this("peter", "parker") {
        println("secondary costructor")
    }

    init {
        println("init 2")
    }

    fun printInfo() {
        var displayNickName = nickName ?: "no nickname"
        println("$firstName ($nickName) $lastName")
    }
}