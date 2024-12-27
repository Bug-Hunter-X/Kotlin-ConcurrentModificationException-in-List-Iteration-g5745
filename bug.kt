```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 3=three, 5=five}

    // ConcurrentModificationException
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    for (item in list2) {
        if (item % 2 == 0) {
            list2.remove(item)
        }
    }
    println(list2) // Throws ConcurrentModificationException
}```