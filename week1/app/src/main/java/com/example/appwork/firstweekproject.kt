package com.example.appwork

import java.util.*

/*
//Q4 First week assignment
class Human(var name: String ="Pikachu"){
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
open class Human(var name: String ="Pikachu"){
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
open class Human(var name: String="Pikachu"){
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

    var mana:Boolean? = true
    if ( mana == true) {
        var l1 = Mage()
        l1.attack()
    }
    if (mana == false) {
        var l1 = Human()
        l1.attack()
    }
}




