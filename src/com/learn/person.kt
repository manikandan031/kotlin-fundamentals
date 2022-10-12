package com.learn

class Person(var name: String) {
    fun display() {
        println("Hello ${name}")
    }

    fun displayWithLambda(func: (s: String) -> Unit){
        func(name)
    }
}