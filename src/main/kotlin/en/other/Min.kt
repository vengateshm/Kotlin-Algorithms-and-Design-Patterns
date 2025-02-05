package en.other

import java.lang.IllegalArgumentException

/**
 * Algorithm for finding the minimum value from a list
 *
 */

class Min<T : Comparable<T>> {

    /**
     * returns the minimum element from the list
     *
     * @items - list of elements
     */
    fun compute(items: List<T>) : T {
        if (items.isEmpty()) {
            throw IllegalArgumentException("items is empty!")
        }
        var min = items[0]
        for (i in 1 until items.size) {
            if (min > items[i]) {
                min = items[i]
            }
        }
        return min
    }

}