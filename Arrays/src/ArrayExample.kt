

/**
 * Created by govinds on 7/30/2017.
 */
fun main(arg: Array<String>)
{


    var MyArray = Array<Int>(5) {0}

    for(i in MyArray.indices)
    {
        println(" external Array $i "+MyArray[i])
        if( i==3 && MyArray[i]==0) {
            MyArray[i] = 3

        }
        println("$i : "+ MyArray[i])
    }

for(index in 0..MyArray.size-1)
{
    println(MyArray[index])
}

    for(element in MyArray){

        print(element)
    }
}