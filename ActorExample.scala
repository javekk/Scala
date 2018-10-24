/** 
 * Scala supports actors, in this example we send messages to ourselves
 *
 * Compile  $ scalac ActorExample.scala
 * Run      $ scala  ActorExample
 *
 */

import scala.actors.Actor 
import scala.actors.Actor._ 

object ActorExample {

    val worker = actor { //actor factory method
        loop { 
            receive { //in this case even react is good
                case "Friday" => println("Thank God it's Friday!") 
                case "Saturday" => exit 
                case x => println("It's " + x + " and I'm working hard.") 
            } 
        } 
    }

    def main(args: Array[String]) { 
        val days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday" 
        for (day <- days.split(" ")) worker ! day //Sending to worker the message "day" [actor!message]
    } 
}