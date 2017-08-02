/**
 * Created by govinds on 7/30/2017.
 */
fun main (arg: Array<String>)
{

    /*
Immutable set
set contain unique element
HashSet also contain unique
elements but sequence is not
 guaranteed in output

     */

    var MySet = setOf<Int>(2,54,3,1,0,9,9,8)

    for(index in MySet)
    {
        print(index)
    }
    println("")

    var MySetmutable = mutableSetOf<Int>(2,54,3,1,0,9,9,8)
    MySetmutable.remove(8)
    for(index in MySetmutable)
    {
        print(index)
    }
    println("")
    var MyhashSetmutable = hashSetOf<Int>(2,54,3,1,0,9,9,8)
    MyhashSetmutable.remove(8)
    for(index in MyhashSetmutable)
    {
        print(index)
    }
}