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

/*
println("Enter ur mana : ")
val scan = Scanner(System.`in`)
val mana = scan.nextLine()

 */

//Q6 First week assignment

open class Human(val name: String="Pikachu", open var mana: Boolean =false){

    open fun attack(){
        println("$name use Fist Attack!")
    }
}
class Mage() : Human(){
    override fun attack(){
        println("$name use Fireball!")
    }
    override var mana: Boolean =true
}
fun main(args: Array<String>) {
    val l1 = Human()

    if (l1.mana == false) {
        l1.attack()
    }
}




