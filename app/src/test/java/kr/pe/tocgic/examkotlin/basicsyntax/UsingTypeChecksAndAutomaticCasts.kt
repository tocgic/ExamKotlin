package kr.pe.tocgic.examkotlin.basicsyntax

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 *
 * Using type checks and automatic casts
 */
class UsingTypeChecksAndAutomaticCasts {
    @Test
    fun UsingTypeChecksAndAutomaticCasts() {
        println("getStringLength(3):${getStringLength(3)}")
        println("getStringLength2(3):${getStringLength2("3")}")
        println("getStringLength3(3):${getStringLength3("123")}")
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 이 구간에서는 자동으로 obj는 'String' 로 casting된다.
            return obj.length
        }
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null
        // 앞의 조건으로 이미 'String'으로 casting 됨
        return obj.length
    }

    fun getStringLength3(obj: Any): Int? {
        // 조건 연산 순서에 의해 우측 항에서는 'String'으로 casting 된다.
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }
}