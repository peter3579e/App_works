package com.example.appwork

import java.util.*

/*
//Q4 First week assignment
class Human(){
    var name="Pikachu"
    fun attack(){
        println("$name use First Attack!")
    }
}
fun main(args: Array<String>){
    var l1=Human()
    l1.attack()
}
 */

/*
//Q5 First week assignment
open class Human(){
    var name="Pikachu"
    open fun attack(){
        println("$name use Fist Attack!")
    }
}
class Mage : Human(){
    override fun attack(){
        println("$name use Fireball!")
    }
}
fun main(args: Array<String>){
    var l1=Mage()
    l1.attack()
}
 */

//Q6 First week assignment
open class Human(){
    var name="Pikachu"
    open fun attack(){
        println("$name use Fist Attack!")
    }
}
class Mage : Human(){
    override fun attack(){
        println("$name use Fireball!")
    }
}
fun main(args: Array<String>) {

    /*
    println("Enter ur character : ")
    val scan = Scanner(System.`in`)
    val n = scan.nextLine()

     */

    var b:Boolean? = true
    if (b == true) {
        var l1 = Mage()
        l1.attack()
    }
    if (b == false) {
        var l1 = Human()
        l1.attack()
    }
    if (b!=true){
      print("null")
    }
}




