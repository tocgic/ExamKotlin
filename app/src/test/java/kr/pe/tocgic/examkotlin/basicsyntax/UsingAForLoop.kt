package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Using a for loop
 */
class UsingAForLoop {
    @Test
    fun UsingAForLoop() {
        println("Using a for loop")
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }
        println("Using a for loop - 2")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }
}