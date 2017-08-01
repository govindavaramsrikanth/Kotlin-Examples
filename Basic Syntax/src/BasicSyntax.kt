/**
 * Created by govinds on 8/1/2017.
 */

// single line comments

/*
Multiple line comments
Comment one
comment two
etc

 */
fun main(arg: Array<String>)
{
var myString ="hello world"  // declaring string
var myNumbero=10 // int declaring
var myDecimal = 1.0  // decmial declaring


    print(myString + myDecimal+myNumbero)
    // if we want to declare after some time

    var mystring:String

    mystring = "hello world "
    print(myString)
    // var is mutable in nature

    // if we want to fix value to hello world only so later on no one  can change

    val str="my constant string"
   // str="hi"
    print(str)

    var a: String = "abc"
    //if you remove the comments of below code  compilation error as kotlin is Null safety  language
    //a = null


//To allow nulls, we can declare a variable as nullable string, written String?:
    var b: String? = "abc"
    b = null // ok

/*
val l = a.length will not give error

but var b.length will give error as it has chance to give null pointer exception
to over come this we need to decare as
if(b!=null)
b.length or b?.length

 */






}