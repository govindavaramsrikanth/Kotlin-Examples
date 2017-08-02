/**
 * Created by govinds on 8/2/2017.
 */


/*
In java 8 you cannot mutate(change) values of outside variable inside Lambdas

But in kotlin you can change the values
Let us see one example
 */

fun main(arg: Array<String>)
{

    var result = 0
var someLambdaMethod: (Int, Int) -> Unit = {x , y -> result = x+y}
addTwoNumbers(5,5 ,{x , y -> result = x+y})
    addTwoNumbers(10,5 ,someLambdaMethod)
    println("result: $result")

}

fun addTwoNumbers(a:Int, b:Int, someLambdaMethod: (Int, Int) -> Unit)
{

    someLambdaMethod(a , b)

}
