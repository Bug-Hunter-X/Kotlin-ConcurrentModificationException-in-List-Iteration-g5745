```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list) {
        if (item % 2 == 0) {
            toRemove.add(item)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    //Alternatively: Use removeIf for safer modification
    val list2 = mutableListOf<Int>(1,2,3,4,5)
    list2.removeIf { it % 2 == 0 }
    println(list2) // Output: [1,3,5]
}
```