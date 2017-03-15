package kr.pe.tocgic.examkotlin.idioms

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 15..
 */
class ExecutingAStatementIfNull {

    /**
     * Executing a statement if null
     */
    @Test
    fun ExecutingAStatementIfNull() {
        println("* Executing a statement if null")
        val data = mapOf("email" to "jeongyon.cho@gmail.com", "name" to "jay", "number" to 1)
        val email = data["email"] ?: throw IllegalStateException("Email is missing!")
        //val age = data["age"] ?: throw IllegalStateException("Age is missing!") //java.lang.IllegalStateException: Age is missing!
        println("email:$email")
        //println("age:$age")
    }

    /**
     * Execute if not null
     */
    @Test
    fun ExecuteIfNotNull() {
        println("\n* Execute if not null")
        val data = mapOf("email" to "jeongyon.cho@gmail.com", "name" to "jay", "number" to 1)
        data?.let {
            // execute this block if not null
            for ((key, value) in data) {
                println("key:$key, \tvalue:$value")
            }
        }
    }
}