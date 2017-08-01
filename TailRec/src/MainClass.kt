import java.math.BigInteger

/**
 * Created by govinds on 7/28/2017.
 */

fun main(arg: Array<String>){

    println(getFib(0, BigInteger("1"),BigInteger("0")))

    // if u give 10000 it will give stack overflow exception
    //to overcome just add tailrec infront of function
}
tailrec fun getFib(n:Int , a:BigInteger,b:BigInteger):BigInteger{
    if(n==0)
        return b
    else
        return getFib(n-1,a+b,a)
}