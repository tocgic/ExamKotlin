package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 */
class ReadOnlyList {
    @Test
    fun main() {
        val list = listOf("a", "b", "c")
        for (item in list) {
            print("\t$item")
        }
        println()
        print("list[0]:${list[0]}")
        //list[0] = "d" //compile Error

        var varList: List<String> = listOf("a", "b", "c")
        for (item in varList) {
            print("\t$item")
        }
        println()
        print("list[0]:${varList[0]}")

    }
}