/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

class App {
    
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val nombre: String = "Kotlin"
    println("$nombre")
    println(App().greeting)
}
