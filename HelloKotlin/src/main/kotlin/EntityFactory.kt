object EntityFactory {
    fun create() = Entity("id", "name")

}

class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id -> $id, name -> $name"
    }
}

fun main() {

    val entity = EntityFactory.create()
    println(entity)

}