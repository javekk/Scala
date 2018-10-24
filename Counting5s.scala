/** 
 *  In this example we coount how many times the number 5
 *  occurs in a large array using Actors
 *
 * Compile  $ scalac Counting5s.scala
 * Run      $ scala  Counting5s
 *
 */

import scala.actors.Actor 
import scala.actors.Actor._ 

object Counting5s {
    
    val random = new java.util.Random() //make up data
    val numberOfactors = 4 // this depends on how many cores your machine has

    def main(args: Array[String]){

        val Size = 1000000 //1M
        var seqCount, conCount = 0
        val array = new Array[Int](Size)
        for(i <-0 until Size) { array(i) = 1 + random.nextInt(10)}

        //Counting without The Segment Method
        var startTime = System.currentTimeMillis
        for(runs <-1 to 1000) seqCount = count5sSequentially(array)
        var finishtime = System.currentTimeMillis
        printf("%5d ms. to find %d threes\n", finishtime - startTime, seqCount)

    }

    def count5sSequentially(a: Array[Int]) = {
        var count = 0
        for(n <- a; if n == 5) count += 1
        count
    }
}