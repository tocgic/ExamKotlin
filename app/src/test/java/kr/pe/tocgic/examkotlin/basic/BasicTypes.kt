package kr.pe.tocgic.examkotlin.basic

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 16..
 */
class BasicTypes {
    @Test
    fun representation() {
        val number1 = Integer(10) // create new instance
        val number2 = Integer(10) // create new instance
        val number3 = number1
        // check if number1 and number2 are Structural equality
        println("number1 == number2\t${number1 == number2}") // prints true
        // check if number1 and number2 points to the same object
        // in other words, checks for Referential equality
        println("number1 === number2\t${number1 === number2}") // prints false
        // check if number1 and number3 points to the same object
        println("number1 === number3\t${number1 === number3}") // prints true

        val num1: Int = 10
        val num2: Int = 10
        val num3 = num1
        println("num1 == num2\t${num1 == num2}") // prints true
        println("num1 === num2\t${num1 === num2}") // prints true
        println("num1 === num3\t${num1 === num3}") // prints true
    }

    @Test
    fun explicitConversions() {
        /**
         * error 발생
         */
        val a: Int? = 1
        //val b: Long? = a //오류 발생 : Error:(36, 24) Type mismatch: inferred type is Int? but Long? was expected
        //println(a == b)
    }

    @Test
    fun arrays() {
        val asc = Array(5, { i -> (i * i).toString() })
        for (item in asc) {
            print("\t$item")
        }
        println()

        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]
        for (item in x) {
            print("\t$item")
        }
        println()
    }

    @Test
    fun strings() {
        val str = "12345"
        println(str[0])
    }

    @Test
    fun stringLiterals() {
        val text = """
            for (c in "foo")
                print(c)
        """
        println(text)

        val textTrimMargined = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
        println(textTrimMargined)
    }

    @Test
    fun stringTemplates() {
        val price = """
        |${'$'}9.99
        """.trimMargin()
        println(price)
    }
}