/** 
 * Example get directly from here:
 * https://docs.scala-lang.org/tour/currying.html
 *
 * Compile  $ scalac CurryingExample.scala
 * Run      $ scala  CurryingExample
 *
 */

 object CurryingTest extends App {

  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)

  def modN(n: Int)(x: Int) = ((x % n) == 0)

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(filter(nums, modN(2))) //List(2, 4, 6, 8)
  println(filter(nums, modN(3))) //List(3, 6)
}