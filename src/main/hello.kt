package main

import com.learn.Person
import com.learn.Question

fun main(args: Array<String>) {
    val mani = Person("Mani")
    mani.display()
    mani.displayWithLambda(::print)

    val q = Question("What is your name?", "Mani")
    println(q.isCorrectAnswer())
    q.answer = "Mani"
    println(q.isCorrectAnswer())
}

fun print(s: String) {
    println(s)
}