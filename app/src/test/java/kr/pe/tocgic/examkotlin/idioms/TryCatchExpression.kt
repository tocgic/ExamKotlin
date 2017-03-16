package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 */
class TryCatchExpression {

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value. ($color)")
        }
    }

    /**
     * 'try/catch' expression
     */
    @Test
    fun main() {
        var color = "White"
        val result = try {
            transform(color)
        } catch (e: IllegalArgumentException) {
            println(e)
            /**
             * Exception 이 발생할 경우, result 값은 "kotlin.Unit"
             */
        }
        println("result:$result")
    }

}