import java.nio.file.attribute.UserDefinedFileAttributeView

/**
 * Created by govinds on 7/27/2017.
 */

fun main(arg: Array<String>){
    var user1 = user("Srikanth",10)
    var user2 = user("Srikanth",10)
    if(user1==user2)
    {
        println("Equal")
    }else{
        println("NotEqual")
    }

    var newUser = user1.copy(name = "govindavaram")  // if we want to override a value just add value
    println("newUser : "+newUser)
    println("User : "+user1)

}

data class user(var name:String,var id:Int){}