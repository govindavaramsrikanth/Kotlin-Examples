/**
 * Created by govinds on 7/30/2017.
 */


/*MAP
Return a list containing the result of applying the given [transform] function
to each element in the orginal collection

 */

fun main(arg: Array<String>)
{

    var mynumber:List<Int> = listOf(2,3,4,6,23,90)

    val mysmallnum = mynumber.filter { v -> v<10 }

    for (num in mysmallnum)
    {
        print(num)
    }
    println ("")
    val mysmall = mynumber.filter { it<10 }

    for (num in mysmall)
    {
        print(num)
    }

    println ("")
    val mysquarenum = mynumber.map { num -> num*num }

    print ("mysquarenum" + mysquarenum)
    println ("")
    val mysquarenumit = mynumber.map { it*it}  // transformed data

    print ("mysquarenumit" + mysquarenumit)
    println ("")


    //we can use filter and transform at a time

    var mysmallsquarenum = mynumber.filter { it<10 }.map { it*it }

print("mynumber : "+mynumber+"  mysmallsquarenum  : "+mysmallsquarenum)
    println("")

var listperson = listOf<person>(person(10,"sree"),person(12,"hisri"),person(13,"srikanth"))

  print("listperson : "+  listperson.filter { it.name.startsWith("s") }.map { it.name })
    println("")

    print("listage : "+  listperson.filter{ it.age<13 }.map { it.age })
    println("")
}


class person(var age:Int,var name:String)
{

}