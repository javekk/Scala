/** 
 * Perform the mathematic operation:
 *        ______
 *       /                            _    _
 *   \3 /  \/2   __|__  |    _   _   |  \/2 |
 *    \/   /\      |    |__ |_| |_|  |_ /\ _|
 *                               _|
 *
 * Compile  $ scalac HelloWorld2.scala
 * Run      $ scala HelloWorld2
 *
 */
import math._ 

object MathOperation extends App{

    def op(num: Int) = {
        val numSquare = num*num
        (cbrt(numSquare) + log(numSquare)).toInt
    }

    println("apply this op to 23 -> " + op(23))
}
