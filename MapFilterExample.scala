/** 
 * FlatMap conbines Map and Filter operations
 * Here we do something similar
 * Map each number within an Integer Array into
 * is natural log and filter on the major of 5
 *
 * Compile  $ scalac MapFilterExample.scala
 * Run      $ scala  MapFilterExample
 *
 */

import math._ 

object MapFilterExample extends App{

    def FME(a : Array[Double]): Array[Double] = {
        if (a.isEmpty) a
        else if(log(a.last) >= 5) Array.concat(Array(log(a.last)), FME(a.dropRight(1)))
        else FME(a.dropRight(1))
    }

    val a1 = Array(3.5, 0, 10000, -21.8, 11, 780)
    val a2 = FME(a1)

    println("[" + a1.mkString(" - ") + "]") // [3.5 - 0.0 - 10000.0 - -21.8 - 11.0 - 780.0]
    println("[" + a2.mkString(" - ") + "]") // [6.659293919683638 - 9.210340371976184]
}