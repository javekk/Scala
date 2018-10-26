/** 
 * Find the last but one element in a list
 *
 * Compile  $ scalac FindThelastButOneElement.scala
 * Run      $ scala  FindThelastButOneElement
 *
 */

object FindTheLastButOneElement {
    //  We could simply use the builtin.....
    //  def fLBO[A](ls: List[A]): A =
    //     if (ls.isEmpty) throw new NoSuchElementException
    //     else ls.init.last

    //  But we are better and we try with functional approach....
    def fLBO[A](ls: List[A]): A = ls match {

        case Nil => throw new NoSuchElementException // don't fail with nil
        case h :: _ :: Nil  => h
        case _ :: tail      => fLBO(tail)
    }

    def main(args: Array[String]){
        
        val l = List(1,2,37,4)
        println("List = " + l)
        println("Last but one element = " + fLBO(l))

    }
}