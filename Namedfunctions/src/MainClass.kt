import java.util.function.IntConsumer

/**
 * Created by govinds on 7/27/2017.
 */
fun main(arg: Array<String>)
{
    var a:String
    a=reformat("sleep")

   println(a)
 var  b= reformat("hi",divideByCamelHumps = true)
    println(b)

 var ab= Memberfunctions().foo()
    println(ab)
}

fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' '):String{

    return str+normalizeCase.toString()+upperCaseFirstLetter.toString()+divideByCamelHumps.toString()+wordSeparator.toString()
}