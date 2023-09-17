fun selectionSort(array: ArrayList<Int>): ArrayList<Int> {
    val sortedArray = arrayListOf<Int>()
    for (i in 0 until array.size) {
        val smallest = getSmallest(array)
        sortedArray.add(array[smallest])
        array.remove(array[smallest])
    }
    return sortedArray
}


fun getSmallest(array: ArrayList<Int>): Int {
    var smallest = array[0]
    var index = 0
    for (i in 1 until array.size) {
        if (array[i] < smallest) {
            smallest = array[i]
            index = i
        }
    }
    return index
}

fun main(args: Array<String>) {
    val array = arrayListOf(0, 2, 5, 1, 8, 23, 31, 21, 93, 213, 31, 11, 1512, 231, 341, 516, 45, 132, 322, 421, 643)
    print(selectionSort(array))
}