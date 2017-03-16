package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class TraversingAMapListOfPairs {
    @Test
    fun main() {
        val map = mapOf("name" to "jay", "email" to "jeongyon.cho@gmail.com", "name" to "jay2")
        for (item in map) {
            println("item:$item")
        }
        for (key in map.keys) {
            println("key:$key,\tvalue:${map[key]}")
        }
        for ((k, v) in map) {
            println("key:$k,\tvalue:$v")
        }
    }
}