package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 *
 * Creating a singleton
 *
 * class keyword 대신 object를 사용한다.
 *
 */
class CreatingASingleton {
    object Resource {
        var name = "Name"
    }

    @Test
    fun main() {
        val resource = Resource
        val resource2 = Resource
        println("Resource.name:${Resource.name}")
        println("resource.name:${resource.name}")
        println("resource2.name:${resource2.name}")
        Resource.name = "Resource.name"
        println("Resource.name:${Resource.name}")
        println("resource.name:${resource.name}")
        println("resource2.name:${resource2.name}")
        resource.name = "resource.name"
        println("Resource.name:${Resource.name}")
        println("resource.name:${resource.name}")
        println("resource2.name:${resource2.name}")
    }
}