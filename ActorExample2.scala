/** 
 * Scala supports actors, 
 * in this example we create 5 actor
 * and than we send 5000 votes(Yes|No) to each of them
 *
 * Compile  $ scalac ActorExample2.scala
 * Run      $ scala  ActorExample2
 *
 */

 import scala.actors.Actor

 object ActorExample2 {

    def main(args: Array[String]){

        // Create and start some actors 
        val actors = (1 to 5) map (new Counter(_)) 
        for(actor <- actors) { actor.start } 

        // Send numbers to the actors (1000 votes each)
        val random = new scala.util.Random 
        for (i <- 1 to 5000) { 
            actors(i % actors.length) ! random.nextBoolean 
        } 
        
        // Tell the actors to quit 
        actors foreach( _ ! "quit") 
    }

    class Counter(id: Int) extends Actor { 
        var yes, no = 0     
        def act = loop { 
            react { 
                case true => yes += 1 
                case false => no += 1 
                case "quit" => printf("Counter #%d got %d yes, %d no.\n", id, yes, no) 
                case x => println("Counter " + id + " didn't understand " + x) 
            } 
        } 
    }
 }