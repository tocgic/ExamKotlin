package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test
import java.io.File

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * - ?      If not null shorthand
 * - ?:     If not null and else shorthand
 */
class IfNotNullShorthand {
    @Test
    fun main() {
        val files = File("Test").listFiles()

        println(files?.size)
        //If not null shorthand
        println(files?: "empty")
        //If not null and else shorthand
        println(files?.size ?: "empty")

        val numbers: IntArray = intArrayOf(1, 2, 3, 4)
        println(numbers.size)
        println(numbers.size ?: "empty")
        println(numbers?.indices ?: "empty")
    }
}