package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Return on when statement
 *
 */
class ReturnOnWhenStatement {
    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value. ($color)")
        }
    }

    @Test
    fun main() {
        var color = "Red"
        println("$color tramsfrom ${transform(color)}")
        color = "White"
        println("$color tramsfrom ${transform(color)}") //java.lang.IllegalArgumentException: Invalid color param value. (White)
    }
}