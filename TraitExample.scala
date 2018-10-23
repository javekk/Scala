/** 
 * Traits are similar to Java Interfaces, but more halfway between an interface and a class
 * They have implementations of methods
 * But they cannot contain state
 *
 * Compile  $ scalac TraitExample.scala
 * Run      $ scala  TraitExample
 *
 */

trait Beauty{

    def isBeutiful: Boolean               //abstract
    def isUgly: Boolean = !isBeutiful     //implementation
}

class RandomGuy(x:Int) extends Beauty{

    var beutyPoints: Int = x
    def isBeutiful = this.beutyPoints > 5
}

object TraitExample extends App{

    val bob = new RandomGuy(6)
    val soap = new RandomGuy(3)

    println("Is Bob beutiful? -> " + bob.isBeutiful)   //yea, he is ;D
    println("Is Soap beutiful? -> " + soap.isBeutiful) //no, this poor guy is ugly ):
}