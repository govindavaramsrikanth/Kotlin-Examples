/**
 * Created by govinds on 7/30/2017.
 */


fun main(arg: Array<String>){

    var MynumberList = listOf<Int>(1,2,3,4,5,76,77,10,7,10)

    var lessthenten = MynumberList.filter { it<10 }.map { it*it }

    print(MynumberList.all { num -> num >10 }) // Are all elements greater than 10?
    //or  above all is the function so we can keep ()
    print(MynumberList.all ({ it >10 }))

    print("lessthenten.any({it<10}) ${lessthenten.any({it<10})}")

    print("MynumberList.count({it<10}) value :  ${MynumberList.count({it<10})}")
    print("find : will return first no:  ${MynumberList.find({it>10})}")
}