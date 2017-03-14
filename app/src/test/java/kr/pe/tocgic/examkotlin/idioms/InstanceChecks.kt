package kr.pe.tocgic.examkotlin.idioms

import kr.pe.tocgic.examkotlin.idioms.dtos.Customer
import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class InstanceChecks {
    @Test
    fun main() {
        var x: Any
        x = Customer("jay", "jeongyon.cho@gmail.com")
        when (x) {
            is Customer -> x.copy(email = "jeongyon.cho@naver.com")
//            is foo() -> //compile Error
            else -> x
        }
    }

    fun foo() {
        println("foo()")
    }
}