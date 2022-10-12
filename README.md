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

