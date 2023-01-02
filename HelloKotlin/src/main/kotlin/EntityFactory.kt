import java.util.*

enum class EntityType {
    Easy, Medium, Hard, Help;

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
            EntityType.Help -> entityType.getFormatedName()
        }
        return when (entityType) {
            EntityType.Easy -> return Entity.Easy(id, name)
            EntityType.Medium -> return Entity.Medium(id, name)
            EntityType.Hard -> return Entity.Hard(id, name, "high")
            EntityType.Help -> return Entity.Help
        }
    }

}

sealed class Entity() {

    object Help : Entity() {
        val name = "help"
    }

    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()

    data class Hard(val id: String, val name: String, val difficulty: String) : Entity()

}

fun main() {

    val entity: Entity = EntityFactory.create(EntityType.Hard)

    val msg = when (entity) {
        is Entity.Easy -> "easy class"
        is Entity.Hard -> "hard class "
        Entity.Help -> "help class"
        is Entity.Medium -> "medium class"
    }
    println(msg)


}