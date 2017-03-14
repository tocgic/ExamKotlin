package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Defining functions
 */
class DefiningFunctions {
    @Test
    fun DefiningFunctions() {
        print("sum of 3 and 5 is ")
        println(sum(3, 5))

        print("sum of 3 and 5 is ")
        println(sum2(3, 5))

        printSum(3, 5)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
}
