package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Using when expression
 */
class UsingWhenExpression {
    @Test
    fun UsingWhenExpression() {
        println("Using when expression")
        println("describe(\"Hello\") : ${describe("Hello")}")
        println("describe(1) : ${describe(1)}")
        println("describe(2) : ${describe(2)}")
        println("describe(10L) : ${describe(10L)}")
        println("describe(3.4) : ${describe(3.4)}")
        println("describe('a') : ${describe('a')}")
        println("\ndescribe2(\"Hello\") : ${describe2("Hello")}")
        println("describe2(1) : ${describe2(1)}")
        println("describe2(2) : ${describe2(2)}")
        println("describe2(10L) : ${describe2(10L)}")
        println("describe2(3.4) : ${describe2(3.4)}")
        println("describe2('a') : ${describe2('a')}")
        println("\ndescribe3(\"Hello\") : ${describe3("Hello")}")
        println("describe3(1) : ${describe3(1)}")
        println("describe3(2) : ${describe3(2)}")
        println("describe3(10L) : ${describe3(10L)}")
        println("describe3(3.4) : ${describe3(3.4)}")
        println("describe3('a') : ${describe3('a')}")
    }

    fun describe(obj: Any): String {
        return when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
    }

    fun describe2(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

    fun describe3(obj: Any) =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }
}