package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 */
class ExtensionFunctions {
    /**
     * space to camelCase
     */
    fun String.spaceToCamelCase(): String {
        val source = this
        val result = StringBuilder()
        var needToUpperCase = false
        for (index in source.indices) {
            var item = source[index]
            if (item == ' ') {
                needToUpperCase = true
            } else {
                if (needToUpperCase) {
                    item = item.toUpperCase()
                    needToUpperCase = false
                }
                result.append(item)
            }
        }
        return result.toString()
    }

    fun String.spaceToCamelCase2(): String = String(
        mapIndexed {
                index, c -> if (index > 0 && this[index - 1] == ' ') c.toUpperCase() else c
                }.
                filter { it != ' ' }.toCharArray()
    )

    @Test
    fun main() {
        println("Convertthistocamelcase".spaceToCamelCase())
        println("Convert this to camelcase".spaceToCamelCase())
        println("Convert  this  to  camelcase".spaceToCamelCase())
        println("Convertthistocamelcase".spaceToCamelCase2())
        println("Convert this to camelcase".spaceToCamelCase2())
        println("Convert  this  to  camelcase".spaceToCamelCase2())

        val limit = 10000
        var count = 0
        val startTime = System.currentTimeMillis()
        while (count++ < limit) {
            "Convert  this  to  camelcase".spaceToCamelCase()
        }
        val processedTime = System.currentTimeMillis() - startTime
        count = 0
        val startTime2 = System.currentTimeMillis()
        while (count++ < limit) {
            "Convert  this  to  camelcase".spaceToCamelCase2()
        }
        val processedTime2 = System.currentTimeMillis() - startTime2
        println("processedTime:$processedTime")
        println("processedTime2:$processedTime2")

    }
}