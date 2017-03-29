package kr.pe.tocgic.examkotlin.classesandobjects

import org.junit.Test

/**
 * Created by tocgic on 2017. 3. 23..
 */
class ClassesAndInheritance {
    @Test
    fun test() {
        val person = Person("Jay")
        val personSimple = PersonSimple("Jay")
        val customer = Customer("myNameIsJay")
        customer.print()
        val personDetail = PersonMutable("Jay", "Cho", 18, true)

        val father = Human("Jay")
        val daughter = Human("seoYoung", father)
        val son = Human("sungHa", father)
        father.print()

        var dontCreateMe = DontCreateMe.instance
        println("dontCreteMe:${dontCreateMe.toString()}")
        dontCreateMe = DontCreateMe.instance
        println("dontCreteMe:${dontCreateMe.toString()}")
        dontCreateMe = DontCreateMe.instance
        println("dontCreteMe:${dontCreateMe.toString()}")

        val myView = MyView(1, 2)
    }

    class Person constructor(firstName: String) {
        init {
            println("Person, init firstName with '$firstName'")
        }
    }

    class PersonSimple(firstName: String) {
        init {
            println("PersonSimple, init firstName with '$firstName'")
        }
    }

    /**
     * 초기화 순서 : top to down ?
     */
    class Customer(name: String) {
        fun print() {
            println("customerKeyToUpper:$customerKeyToUpper")
            println("customerKeyToLower:$customerKeyToLower")
        }

        // init 순서 #1
        val customerKeyToUpper = name.toUpperCase()

        // init 순서 #2
        init {
            println("Customer, init name with '$name'")
            println("Customer, init customerKeyToUpper is '$customerKeyToUpper'")

            //ERROR, Variable 'customerKeyToLower' must be initialized
            //println("Customer, init customerKeyToLower is '$customerKeyToLower'")
            //customerKeyToLower = name.toLowerCase()
        }

        val customerKeyToLower = name.toLowerCase()
    }

    class PersonMutable(val firstName: String, val lastName: String, var age: Int, maile: Boolean) {
        fun print() {
            println("name:$firstName, $lastName")
            println("age:$age")
            //ERROR : Unresolved reference (생성자에 val/var 이 없는 경우)
            //println("maile:$maile")
        }
    }

    class Human(val name: String) {
        val children: ArrayList<Human> = arrayListOf()

        constructor(name: String, parent: Human) : this(name) {
            parent.children.add(this)
        }

        fun print() {
            println("name:$name")
            if (children.isNotEmpty()) {
                println("$name's children count is ${children.size}")
                for (child in children) {
                    child.print()
                }
            }
        }
    }

    /**
     * https://medium.com/@adinugroho/singleton-in-kotlin-502f80fd8a63#.4h1bsouk7
     */
    class DontCreateMe private constructor() {
        companion object {
            val instance: DontCreateMe by lazy {
                DontCreateMe()
            }
        }
    }

    /**
     * https://medium.com/@adinugroho/singleton-in-kotlin-502f80fd8a63#.4h1bsouk7
     */
    /*public class Singleton private constructor() {
        init {
            println("This ($this) is a singleton")
        }

        private object Holder {
            val INSTANCE = Singleton()
        }

        companion object {
            val instance: Singleton by lazy { Holder.INSTANCE }
        }

        var b: String? = null
    }*/

    open class Base(p: Int) {
        constructor(p: Int, q: Int) : this(p) {

        }
    }

    class Derived(p: Int) : Base(p)

    class MyView : Base {
        init {
            println("MyView, init")
        }
        constructor(p: Int) : super(p) {
            println("MyView, constructor(p: Int)")
        }

        constructor(p: Int, q: Int) : super(p, q) {
            println("MyView, constructor(p: Int, q: Int)")
        }
    }
}