/**
 * Created by govinds on 7/30/2017.
 */
fun main(arg: Array<String>)
{




    var list = listOf<String>("a","b","c")  // immutable , Fixed size , Read only
println(list.get(2))
    for (listindex in list)
    {
        print(listindex)

    }


    // use mutable

    var mutablelist = mutableListOf<String>()

    mutablelist.add("a")
    mutablelist.add("b")
print(mutablelist)

    var arraymutable = ArrayList<String>()
    arraymutable.addAll(mutablelist)
arraymutable.add("d")
    println(arraymutable)

    var arraylistof = arrayListOf<String>()

    arraylistof.addAll(arraymutable)
    arraylistof.remove("a")
    println(arraylistof)



    var Register: MutableList<EmployeeDetails> = mutableListOf()
    var EmployeeDetails1 = EmployeeDetails()
    var EmployeeDetails2 = EmployeeDetails()
    var EmployeeDetails3 = EmployeeDetails()
    EmployeeDetails1.Name="srikanth"
    EmployeeDetails1.Id=123
    EmployeeDetails2.Name="sri"
    EmployeeDetails2.Id=456
    EmployeeDetails3.Name="sree"
    EmployeeDetails3.Id=789
    Register.add(EmployeeDetails1)
    Register.add(EmployeeDetails2)
    Register.add(EmployeeDetails3)

  for(index in 0.. Register.size-1)
  {
      println (Register.get(index).Name)
  }
}