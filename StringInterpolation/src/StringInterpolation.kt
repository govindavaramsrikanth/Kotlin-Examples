/**
 * Created by govinds on 8/1/2017.
 */
fun main(arg: Array<String>){
    var name = "myname"
    println(name)
    var mynamevar:String
    mynamevar="mynamevar"
    println(mynamevar)
display("some name")
    // below is the syntax of creating object no need of new
var myname = Myname()
        myname.display("somename")
myname.name="myname"
    myname.display(myname.name)
print("name of some person ${myname.name}")
}

fun display(name:String){

    println("myname" +name)
}

class Myname{
    var name:String=""
    fun display(name:String){

        println("myname" +name)
    }
}