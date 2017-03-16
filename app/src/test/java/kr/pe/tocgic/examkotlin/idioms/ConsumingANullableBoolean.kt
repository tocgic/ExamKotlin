package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Consuming a nullable Boolean
 *
 */
class ConsumingANullableBoolean {
    @Test
    fun main() {
        val b: Boolean? = null
        if (b == true) {
            //...
        } else {
            // 'b' is false or null
        }
    }
}