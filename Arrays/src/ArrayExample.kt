/**
 * Created by govinds on 7/20/2017.
 */
fun main(arg: Array<String>){
var n: Int =10
    var a= IntArray(n)
    for(i in 1..n)

    {
        try {
            a[i] = i  // to store array value
        }catch (e: ArrayIndexOutOfBoundsException ){
e.printStackTrace()
        }
    }

    for (i in a.indices){

        println("a value ${a[i]}" )
    }
}