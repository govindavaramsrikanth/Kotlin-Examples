/**
 * Created by govinds on 8/1/2017.
 */
/*
In this example we will learn basic syntax and example of
	Loops:
•	For Loop
•	While Loop
•	Do while Loop
	BREAK Statement with Labeled For Loop
	Continue Statement with Labeled For Loop

 */

fun main(arg: Array<String>)
{
// for syntx is for open brace variable  "in " operator range close brace
    print("value of i")
    for (i in 1..10)
    {
        print(" $i")
    }
    println("")
var j:Int=1
    print("value of J")
   while(j<=10)
    {

        print(" $j")
        j++
    }
    println("")

var k : Int=1
    print("value of k")
    do {
print( " $k")
        k++
    }while (k<=10)
    println("")

// Break statements
    print("Break  l value after 5 " )
    for(l in 1..10)
    {
        print(l)
        if (l==5)
        {
            break
        }
    }
 //Labeled for loops
println("")
    print("Labeled for loop break   l value after 22 " )
    println("")
  myloop@ for(n in 1..3) {
       for (m in 1..3) {
           println("$n $m")
           if (m == 2 && n==2) {
              // break // will break inner for loop to break outer loop  use
          break@myloop
           }
       }
   }



    // continue statement
println("continue statement")
    for(o in 1..10)
    {
        if(o==5) {
          continue // if we want to skip 5
        }
        print(o)
    }
    println("continue statement  myouterloop@")
  myouterloop@  for(p in 1..3)
    {
        for (q in 1..3) {
            if (p == 2 && q==2) {
                continue@myouterloop // if we want to skip 5
            }
            println("$p $q")
        }
    }

}