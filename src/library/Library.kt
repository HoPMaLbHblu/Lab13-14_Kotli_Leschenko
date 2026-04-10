package library

class Library<T> {
    private val items: MutableList<T> = mutableListOf()

    fun add(item: T) {
        items.add(item)
    }

    fun remove(item: T): Boolean {
        return items.remove(item)
    }

    fun getAll(): List<T> = items.toList()

    fun size(): Int = items.size

    fun clear() {
        items.clear()
    }
}