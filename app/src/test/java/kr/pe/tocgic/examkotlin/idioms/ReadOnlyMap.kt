package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class ReadOnlyMap {
    @Test
    fun main() {
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        println(map["key"])
        println(map["a"])
        println(map.get("a"))
    }
}