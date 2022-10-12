package main

import com.learn.Person

fun main(args: Array<String>) {
    val mani = Person("Mani")
    mani.display()
    mani.displayWithLambda(::print)
}

fun print(s: String) {
    println(s)
}