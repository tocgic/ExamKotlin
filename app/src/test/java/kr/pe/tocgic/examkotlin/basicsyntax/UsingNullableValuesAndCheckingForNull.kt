package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Using nullable values and checking for null
 */
class UsingNullableValuesAndCheckingForNull {
    @Test
    fun UsingNullableValuesAndCheckingForNull() {
        parseInt("1")

        printProduct("1", "2")
        printProduct2("1", "2")
    }

    /* compile error
    fun parseInt(str: String): Int {
        return null
    }*/

    fun parseInt(str: String): Int? {
        return Integer.parseInt(str)
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x != null && y != null) {
            println(x * y)
        }
        else {
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    fun printProduct2(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x == null) {
            println("Wrong number format in arg1: '${arg1}'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '${arg2}")
            return
        }

        // null check가 이루어진 뒤 x, y 는 non-nullable 로 casting된다.
        println(x * y)
    }
}