package kr.pe.tocgic.examkotlin.packages

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 16..
 */
class ReturnsAndJumps {
    val ints = listOf(0, 1, 2, 3, 4)

    @Test
    fun returnAtLabels() {
        println("foo()")
        foo()
        println("\nfoo2()")
        foo2()
        println("\nfoo3()")
        foo3()
        println("\nfoo4()")
        foo4()
    }

    fun foo() {
        ints.forEach {
            if (it == 0) return
            print(it)
        }
    }

    fun foo2() {
        ints.forEach lit@ {
            if (it == 0) return@lit
            print(it)
        }
    }

    fun foo3() {
        ints.forEach {
            if (it == 0) return@forEach
            print(it)
        }
    }

    fun foo4() {
        ints.forEach(fun(value: Int) {
            if (value == 0) return
            print(value)
        })
    }
}