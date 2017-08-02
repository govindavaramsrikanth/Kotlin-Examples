package Sample

/**
 * Created by govinds on 7/27/2017.
 */
open class EmployeeDetails {

    private var name1:String
    var age1:Int

    init {
        name1=""
        age1=0
    }

    internal  constructor(){}

    internal constructor(name:String)
    {

    }

    internal  constructor(name:String, age:Int)
    {
        age1=age
println("name: ${name1} , Age: ${age1}")
    }


}