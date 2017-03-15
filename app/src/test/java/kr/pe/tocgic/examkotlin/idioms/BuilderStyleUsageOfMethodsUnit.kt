package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Builder-style usage of methods that return Unit
 */
class BuilderStyleUsageOfMethodsUnit {
    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }

    fun arrayOfMinusOnes2(size: Int) = IntArray(size).apply { fill(-1) }

    @Test
    fun main() {
        val array = arrayOfMinusOnes(5)

        println("array values")
        for (item in array) {
            print("\t$item")
        }
        println()
    }
}