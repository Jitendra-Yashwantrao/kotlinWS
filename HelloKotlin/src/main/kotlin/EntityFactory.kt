interface IDProvider {
    fun getID(): String
}

class Entity private constructor(val id: String) {

    companion object EntityFactory : IDProvider {
        fun create() = Entity(getID())

        override fun getID(): String {
            return "id"
        }
    }
}

fun main() {

    val entity = Entity.EntityFactory.create()
    println(entity.id)

}