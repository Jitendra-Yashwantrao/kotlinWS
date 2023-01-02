fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith(prefix = "j") }
}

var predicate: (String) -> Boolean = {
    it.startsWith("g")
}

fun main() {

    var mylist = listOf<String>("kotlin", "java", "javascript", "golang")
    printFilteredStrings(mylist) { it.startsWith("j") }

    printFilteredStrings(mylist, getPrintPredicate())

    printFilteredStrings(mylist, predicate)

    printFilteredStrings(mylist, null)

}