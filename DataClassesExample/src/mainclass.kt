/**
 * Created by govinds on 7/27/2017.
 */
fun main(arg: Array<String>)
{

    var Employee1=Employee(name = "Srikanth",id = 1)
    var Employee2 = Employee(name = "Srikanth",id = 0)

if (Employee1==Employee2)
{
    println("Employee details are same ")
}else
{
    println("not Same")
}

    // copy data

    var Employee3 = Employee1.copy()
    println("Employee1 data copied to Employee3 ${Employee3.id}")

    var Employee4 = Employee1.copy(name = "sree")
    println("Employee1 data updated and copied to Employee4 ${Employee4.name}")

}