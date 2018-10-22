/** 
 * Find if a string is palindrome or not
 *
 * Compile  $ scalac Palindrome.scala
 * Run      $ scala Palindrome
 *
 */

 object Palindrome extends App{
    
    def isPal(s:String):Boolean = { 
        s.isEmpty ||   
        ((s.last == s.head) && isPal(s.tail.dropRight(1)))
    }

    println("cane is palindrome? -> " + isPal("cane")) //false
    println("wow is palindrome? -> " + isPal("wow"))   //true
    println("roor is palindrome? -> " + isPal("roor")) //true

 }