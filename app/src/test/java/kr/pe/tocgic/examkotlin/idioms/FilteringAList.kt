package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class FilteringAList {
    @Test
    fun filteringAList() {
        val list = listOf(-5, -4, -3, -2, -1, 0, 1, 2, 3)
        val positives = list.filter { x -> x > 0 }
        for (item in positives) {
            print("\titem")
        }
        println()
        val positives2 = list.filter { it > 0 }
        for (item in positives2) {
            print("\titem")
        }
        println()

        val lists = listOf(1..50, 3..10, 4..3)
        //val lists = listOf(1..50, 3..10, 4..3 step -1) //compile Error
        for (item in lists) {
            println("item:$item")
            for (x in item) {
                print("\t$x")
            }
            println()
        }

        /**
         * filter 조건을 list에 담을 수는 없을까?
         *
         * val filters = listOf(x -> x > 1, it > 0)
         */
    }

    /**
     * List를 받을수 있는 parameter?
     */
//    fun printList(list: List<T>) {
//        if (list is List<E>) {
//
//        }
//    }
}