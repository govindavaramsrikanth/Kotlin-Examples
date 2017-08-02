/**
 * Created by govinds on 7/27/2017.
 */
fun main(arg: Array<String>)
{
    var student=Student()
   println( student.ageOfStudent(10))
var name = student.nameOfStudent("Srikanth")
println(name)

    var revcap:String =""
   println( revcap.reverseStringandcap("Srikanth"))
}

fun Student.nameOfStudent(name:String):String
{
    return name
}

fun String.reverseStringandcap(value:String):String{
    return value.reversed().toUpperCase()
}