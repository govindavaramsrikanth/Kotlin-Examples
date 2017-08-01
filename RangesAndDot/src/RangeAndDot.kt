/**
 * Created by govinds on 8/1/2017.
 */

// Ranges will use in loops
fun main(arg: Array<String>)
{
   val r1=1..5
// This range contain the number 1,2,3,4,5
    print("r1 value ")
    for (i in r1) {
        print(" $i")
    }
    println("")
    val r2 = 5 downTo 1
    // This range contain the number 5 ,4,3,2,1

    print("r2 value ")
    for (i in r2) {
        print(" $i")
    }
    println("")

    var r3=5 downTo  1 step 2
    // This range contain the number 5,3,1
    print("r3 value ")
    for (i in r3) {
        print(" $i")
    }
    println("")
    var r4 = 1..5 step 2

    //This range will contain numbers 1,3,5 in ascending order
    print("r4 value ")
    for (i in r4) {
        print(" $i")
    }
    println("")


var r5 = 'a'..'z'
    //This range will contain numbers a..z in ascending order
    print("r5 value ")
  var ispresent = 'c' in r5
    print( "ispresent  "+ispresent)

    var ispresents = 'Z' in r5
    print("ispresents "+ispresents)
    println("")

    var countDown = 10.downTo(1)
    //This range will contain numbers 10 ... 1 in ascending order
    print("countDown value ")
    for (i in countDown) {
        print(" $i")
    }
    println("")


    var moveup = 1.rangeTo(10)
    //This range will contain numbers 1..10
    print("moveup value ")
    for (i in moveup) {
        print(" $i")
    }
    println("")
}