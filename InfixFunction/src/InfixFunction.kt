/**
 * Created by govinds on 8/1/2017.
 */
/*
infix Function can be a member function or Expression Function
there properties are they just contain SINGLE parameter
they have prefix of "infix"
All infix functions are Extension functions
but all Extension functions are not infix functions
 */

fun main(arg: Array<String>)
{var x=10
    var y=11
val greaterval = x.greaterThen(y)
    println("$y.greaterThen($x)  $greaterval")

    val lesserval = x lessThen y
    println("$x lessThen $y  : $lesserval")

//    x.minus(12,10)  this will give error as this function is not extension of Int class

    print(minus(12,10))
}


fun Int.greaterThen(other:Int):Int
{
    if (this>other)
        return this
    else
        return other
}


infix  fun Int.lessThen(other:Int):Int
{
    if (this<other)
        return this
    else
        return other
}

//infix  fun Int.mul(x:Int , y:Int):Int
//{
//  return  x*y
//}  this method will give error as it ommit basic concept of infix infix accept only one parameter


 fun minus(x:Int , y:Int):Int
{
    return  x-y
}