/** 
 * val in scala is immutable
 *
 * Compile  $ scalac ImmutableExample.scala
 * Run      $ scala ImmutableExample
 *
 */

 object ImmutableExample extends App{
    val v1 = "1 2 3 4 3 2 1"
    v1.replaceAll("2","9")
    println(v1) // "1 2 3 4 3 2 1"
    //v1 = v1.replaceAll("2","9") <- does not work, v1 is immutable
    val v2 = v1.replaceAll("2","9")
    println(v2) // "1 9 3 4 3 9 1"
 }