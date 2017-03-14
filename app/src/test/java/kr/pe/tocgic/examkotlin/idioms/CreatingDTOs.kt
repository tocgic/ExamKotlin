package kr.pe.tocgic.examkotlin.idioms

import kr.pe.tocgic.examkotlin.idioms.dtos.Customer
import kr.pe.tocgic.examkotlin.idioms.dtos.CustomerNoneData
import kr.pe.tocgic.examkotlin.idioms.dtos.User
import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 13..
 */
class CreatingDTOs {

    @Test
    fun CreatingDTOs() {
        println("*** data class Customer ***")
        val customer = Customer("jay", "jeongyon.cho@gmail.com")
        val customer2 = Customer("jay", "jeongyon.cho@gmail.com")
        val copiedCustomer: Customer = customer.copy()

        println("customer.name:${customer.name}")
        println("customer.email:${customer.email}")
        println("equals():${customer.equals(customer2)}")
        println("==:${customer == customer2}")
        println("equals():${customer.equals(copiedCustomer)}")
        println("==:${customer == copiedCustomer}")
        println("customer.hashCode():${customer.hashCode()}")
        println("customer2.hashCode():${customer2.hashCode()}")
        println("copiedCustomer.hashCode():${copiedCustomer.hashCode()}")
        println("customer.toString():$customer")
        println("customer2.toString():$customer2")
        println("copiedCustomer.toString():$copiedCustomer")

        println("\n*** class CustomerNoneData ***")
        val customerNoneData: CustomerNoneData = CustomerNoneData("jay", "jeongyon.cho@gmail.com")
        val customerNoneData2 = CustomerNoneData("jay", "jeongyon.cho@gmail.com")
        //val copiedCustomerNoneData: CustomerNoneData? = customerNoneData.copy() //copy() 메소드 없음
        println("customerNoneData.name : ${customerNoneData.name}")
        println("customerNoneData.email : ${customerNoneData.email}")
        println("equals():${customerNoneData.equals(customerNoneData2)}")
        println("==:${customerNoneData == customerNoneData2}")
        println("customerNoneData.hashCode() : ${customerNoneData.hashCode()}")
        println("customerNoneData2.hashCode() : ${customerNoneData2.hashCode()}")
        println("customerNoneData.toString():$customerNoneData")
        println("customerNoneData2.toString():$customerNoneData2")

        println("\n*** Data Classes ***")
        val jack = User(name = "Jack", age = 1)
        val olderJack = jack.copy(age = 2)
        val jane = User("Jane", 35)
        val olderJane = jane.copy(age = 36) //.copy(36) error
        val (name, age) = jane
        println("$name, $age years of age")

    }
}