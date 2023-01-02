import java.util.*

enum class EntityType {
    Easy, Medium, Hard;

    fun getFormatedName(): String {
        return name.lowercase().uppercase()
    }
}

object EntityFactory {
    fun create(entityType: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when (entityType) {
            EntityType.Easy -> entityType.name
            EntityType.Hard -> entityType.getFormatedName()
            EntityType.Medium -> entityType.getFormatedName()
        }
        return Entity(id, name)
    }

}

class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id -> $id, name -> $name"
    }
}

fun main() {

    val entity = EntityFactory.create(EntityType.Easy)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.Medium)
    println(mediumEntity)
}