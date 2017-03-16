package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Calling multiple methods on an object instance ('with')
 *
 */
class CallingMultipleMethodsOnObj {
    class Turtle {
        fun penDown() {
            println("penDown()")
        }

        fun penUp() {
            println("penUp()")
        }

        fun turn(degrees: Double) {
            println("turn($degrees)")
        }

        fun forward(pixels: Double) {
            println("forward($pixels)")
        }
    }

    @Test
    fun main() {
        val myTurtle = Turtle()
        with(myTurtle) {
            penDown()
            for (i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            penUp()
        }

        println("\n* not use 'with'")
        myTurtle.penDown()
        for (i in 1..4) {
            myTurtle.forward(100.0)
            myTurtle.turn(90.0)
        }
        myTurtle.penUp()
    }
}