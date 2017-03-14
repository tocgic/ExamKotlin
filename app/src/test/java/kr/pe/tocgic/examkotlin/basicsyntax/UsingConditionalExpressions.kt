package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Using conditional expressions
 */
class UsingConditionalExpressions {
    @Test
    fun UsingConditionalExpressions() {
        println("max of 0 and 42 is ${maxOf(0, 42)}")
        println("max of 0 and 42 is ${maxOf2(0, 42)}")
    }

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOf2(a: Int, b: Int) = if (a > b) a else b
}