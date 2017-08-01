/**
 * Created by govinds on 7/24/2017.
 */
fun main(arg: Array<String>)
{
    var string1: String ="Hi this is STRING one "
    var string2: String ="Hi this is STRING one "
    var string3: String ="Hi this is Different STRING  "
    println("String1 lenght ${string1.length}")
    println("String1 toUpperCase ${string1.toUpperCase()}")
    println("String1 toLowerCase ${string1.toLowerCase()}")
    println("String1 value at index 3:  ${string1.get(3)}")
    println("String1  trim and print length:  ${string1.trim().length}")
    println("String1 compare with String2:  ${string1.compareTo(string2)}")
    println("String1 compare with String3:  ${string1.compareTo(string3)}")
    println("String1 :  ${string1.plus("add some thing to exist string")}")
    println("String1 equals to string2:  ${string1.equals(string2)}")
    println("String1 !equals to string2:  ${string1.equals(string3)}")
    println("String1 subsequence:  ${string1.subSequence(3,10)}")
    println("String1 subsequence:  ${string1.split(" ")} " )
    var a = string1.trim().split(" ")
    println("String1 a[0]:  ${a[0]} " )

    for(i in a.indices){
        println("String1 ${a}:  ${a[i]} " )

    }

    println("String1 to replaceFirst:  ${string1.replaceFirst("s","w")} " )
    println("String1 to replace:  ${string1.replace("s","w")} " )
    println("String1 to drop:  ${string1.drop(10)} " )
    println("String1 to dropLast:  ${string1.dropLast(10)} " )
    println("String1 to removeRange:  ${string1.removeRange(0,4)} " )
    println("String1 to reversed:  ${string1.reversed()} " )
   
}