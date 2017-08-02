/**
 * Created by govinds on 7/28/2017.
 */

/*
Companion objects are the objects which will create with in class
 */
fun main(arg: Array<String>){

MyClass.count
print(    MyClass.typeOfCustomers())

}


class MyClass
{

   companion object
    {
        var count:Int = -1
        fun typeOfCustomers():String
        {
            return "Indian"
        }

    }

}

