package com.example.simpletextcomposeapplication


//open means it can be changed unlike final
open class Person constructor(val age: Int) {

    open fun talk() {
        val message: String = "I am a simple person age $age."
        println(message)
    }
}

fun main(args: Array<String>) {
    val simplePerson: Person = Person(age = 30)
    simplePerson.talk()
}

class Teacher constructor(age: Int) : Person(age) {

    //override overrides the original instructions of a fun talk on line 7 but we need super
    //super we call all the logic from the parent
    override fun talk() {

        val message: String
        message = "I am a teacher aged $age"
        println(message)
    }

    fun teach() {
        println("I teach math!")
    }

    fun teacher() {

    }

}