package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Using collections
 */
class UsingCollections {
    @Test
    fun UsingCollections() {
        println("Using collections")
        //Iterating over a collection:
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }

        //Checking if a collection contains an object using in operator:
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }

        //Using lambda expressions to filter and map collections:
        val fruits = listOf("banana", "avocado", "apple", "kiwi")
        fruits
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase()}
                .forEach { println(it)}
    }
}