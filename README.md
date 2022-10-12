# kotlin-fundamentals

## setup
- download kotlin compiler and extract the zip
- add bin folder to path variable
```
kotlinc hello.kt  // compile kotlin code
kotlinc hello.kt -include-runtime -d hello.jar // compile and include kotlin runtime in hello.jar
java -jar hello.jar // run the kotlin code
```

## what is kotlin
- jvm language -> compiles to java byte code and runs on a jvm
- object oriented -> classes, methods, objects etc
- functional -> 
  - support for higher order functions, 
  - can store functions in collections, 
  - can pass functions as parameters
  - can return a function from another function
  - functions are first class things in the language
- less ceremony or less code for a java equivalent

## kotlin classes
- by default class and methods are public
- constructor is defined along with the class name
- no `new` keyword while creating objects
- use `val` for constants and `var` for variables

## kotlin lambda function
```
fun displayWithLambda(func: (s: String) -> Unit) {
    func(name)
}

person.displayWithLambda(::myFunc)

fun myFunc(s: String) {
  print(s)
}

```
## string templates
- kotlin support string templates
```
println("Answer is ${answer}")
```
- strings can be compared using `==`

## if as an expression
- in kotlin `if` can be treated as an expression and  the return value can be assigned to a variable
```
var message = if (a == '2') {
  "Equal"
} else {
  "Not Equal"
} 
```