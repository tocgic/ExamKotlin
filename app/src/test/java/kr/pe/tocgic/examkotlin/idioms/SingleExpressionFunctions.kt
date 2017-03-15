package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Single-expression functions
 *
 */
class SingleExpressionFunctions {
    fun theAnswer() = 42

    //This is equivalent to
    fun theAnswer2(): Int {
        return 43
    }

    @Test
    fun main() {
        println("theAnswer():${theAnswer()}")
        println("theAnswer2():${theAnswer2()}")
    }
}