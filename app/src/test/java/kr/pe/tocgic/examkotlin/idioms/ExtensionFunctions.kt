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

    @Test
    fun main() {
        println("Convertthistocamelcase".spaceToCamelCase())
        println("Convert this to camelcase".spaceToCamelCase())
        println("Convert  this  to  camelcase".spaceToCamelCase())
    }
}