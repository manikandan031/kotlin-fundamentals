package com.learn

class Question(val question: String, val correctAnswer: String) {
    var answer: String = ""
    fun isCorrectAnswer(): String {
        return if (answer == correctAnswer) {
            "Correct"
        } else {
            "Incorrect"
        }
    }
}