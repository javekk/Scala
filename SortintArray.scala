/** 
 * one of the many ways to sort an array of Integer
 *
 * Compile  $ scalac SortIntArray.scala
 * Run      $ scala SortIntArray
 *
 */

 object SortIntArray extends App{
    
    def sortIntArray(a : Array[Int]): Array[Int] = {
        if(a.length <= 1) a
        else{
            val pivot = a(a.length / 2)
            Array.concat(
                sortIntArray(a filter (pivot >)),
                a filter (pivot ==),
                sortIntArray(a filter (pivot <))
            )
        }
    }

    val a1 = Array(3, 0, 10, 21, -11, 78)
    val a2 = sortIntArray(a1)

    println(a1.mkString(",")) //3,0,10,21,-11,78
    println(a2.mkString(",")) //-11,0,3,10,21,78
 }