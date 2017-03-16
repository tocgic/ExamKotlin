package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class DefaultValuesForFunctionParameters {
    @Test
    fun DefaultValuesForFunctionParameters() {
        foo()
        foo(1)
        foo(b = "a")
        foo(1, "a")
        foo(a = 1)
    }

    fun foo(a: Int = 0, b: String = "") {
        println("a:$a, b:$b")
    }
}