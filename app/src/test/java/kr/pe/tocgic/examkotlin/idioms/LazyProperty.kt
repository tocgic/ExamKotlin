package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 14..
 *
 * lazy properties
 * - val 에서 사용할 수 있음
 * - 호출 시점에 초기화 진행
 *
 * lateinit
 * - var 에서 사용할 수 있음
 * - 멤버 변수 지정시, 초기화를 할 수 없는 경우, lateinit 사용
 * - 호출 시점에 초기화 안된 경우, lateinit property modelLazyLate has not been initialized 오류 발생
 */
class LazyProperty {
    @Test
    fun main() {
        println("* create ModelLazy")
        val modelLazy = ModelLazy()
        println("* call ModelLazy.test()")
        modelLazy.test()

        println("\n* create ModleLateInit")
        val model = ModelLateInit()
        //model.modelLazyLate.test() //error : lateinit property modelLazyLate has not been initialized
        model.modelLazy.nameLazy
    }

    class ModelLazy {
        val nameLazy by lazy {
            println(">init nameLazy => Initialize at the time of the call.")
            "text init, nameLazy"
        }

        init {
            println(">init-ModelLazy")
        }

        fun test(): Unit {
            println(">called, test()")
            println("nameLazy:$nameLazy")
        }
    }

    class ModelLateInit {
        init {
            println(">init-ModelLateInit")
        }

        var modelLazy: ModelLazy = ModelLazy()
        lateinit var modelLazyLate: ModelLazy
    }

}