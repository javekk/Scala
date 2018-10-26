/** 
 * Scala supports actors, 
 * in this example we create 5 actor
 * and than we send 5000 votes(Yes|No) to each of them
 *
 * Compile  $ scalac FindThelastElement.scala
 * Run      $ scala  FindThelastElement
 *
 */

object FindTheLastElement {
    //  We could simply use the builtin.....
    //  def last[A](ls: List[A]): A = ls.last

    //  But we are better and we try with functional approch....
    def lastRecursive[A](ls: List[A]): A = ls match {

        // case Nil => throw new NoSuchElementException // don't fail with nil
        case h :: Nil  => h
        case _ :: tail => lastRecursive(tail)
    }

    def main(args: Array[String]){
        
        val l = List(1,2,37,4)
        println("List = " + l)
        println("Last element = " + lastRecursive(l))

    }
}