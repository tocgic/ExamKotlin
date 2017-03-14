package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class UsingRanges {
    @Test
    fun main() {
        println("for (i in 1..100)")
        for (i in 1..100) {
            print("\t$i")
        }
        println("\nfor (i until 100)")
        for (i in 1 until 100) {
            print("\t$i")
        }
        println("\nfor (x in 2..10 step 2)")
        for (x in 2..10 step 2) {
            print("\t$x")
        }
        println("\nfor (x in 10 downTo 1)")
        for (x in 10 downTo 1) {
            print("\t$x")
        }
        println("\nfor (x in 1..10)")
        for (x in 1..10) {
            print("\t$x")
        }
        println()
    }
}