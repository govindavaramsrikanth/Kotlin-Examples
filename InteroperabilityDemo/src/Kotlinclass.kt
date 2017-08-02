/**
 * Created by govinds on 8/1/2017.
 */


fun main(arg: Array<String>)
{
var substration = javaclass.sub(20,10);
    print(substration)
print(addthreeno(10,20))
}


fun add(a:Int , b:Int):Int
{

    return a+b

}

@JvmOverloads
fun addthreeno(a:Int , b:Int,c:Int=10):Int{
    return a*b*c
}