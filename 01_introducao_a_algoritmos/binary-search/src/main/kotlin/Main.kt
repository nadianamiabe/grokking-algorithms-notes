fun binarySearch(list: List<Int>, item: Int): Int? {
    var min = 0
    var max = list.lastIndex
    while (min <= max) {
        val mid = (min + max) / 2
        val guess = list[mid]
        if (guess == item) return mid
        if (guess > item) {
            max = mid - 1
        } else {
            min = mid + 1
        }
    }
    return null
}

fun main(args: Array<String>) {
    val list = (0..100 step 3).toList()
    val result = binarySearch(list, 6)
    println(result)
}