/**
 * Created by govinds on 7/27/2017.
 */
fun main(arg: Array<String>)
{

// if as expressions
    val a=2
    val b=5

    var maxvalue:Int
    if(a>b)
        maxvalue = a
    else{
        maxvalue=b
    }
    println(maxvalue)

    // above code is general

    // if we want to write if as a expression
    // below is the code

    var maxintvalue = if(a>b)a else b

    println("maxintvalue $maxintvalue ")


//    if we have multiple lines in if condition
    // as per the rule last value will return

    var maxintvalue1 = if(a>b) {
        println("a is greater ")
        a
    }
    else {
        println("b is greater ")
        b
    }
    println("maxintvalue $maxintvalue1 ")
    // when as expression replace of switch

var x=100
    when (x){
        0,10-> print("x is in between 0 to 10 ")
        1 -> print("x == 1")
        2 -> print("x == 2")
        in 90..100 -> println("x is in between 90 .. 100 ")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }

    }
    var i=0
    while (i<=10)
    {
        println("while loop $i")
        i++
    }
}