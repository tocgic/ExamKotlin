package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Defining local variables
 */
class DefiningLocalVariables {
    @Test
    fun DefiningLocalVariables() {
        //Assign-once (read-only) local variable:
        val a: Int = 1
        val b = 2
        val c: Int
        c = 3

        //Mutable variable:
        var x = 5
        x += 1

        println("a=$a, b=$b, c=$c, x=$x")
    }
}