package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 */
class IfExpression {
    @Test
    fun main() {
        foo(1)
        foo(2)
        foo(3)
        foo(4)
    }

    fun foo(param: Int) {
        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
        println("param:$param\t result:$result")
    }
}