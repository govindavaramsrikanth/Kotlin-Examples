/**
 * Created by govinds on 7/30/2017.
 */
fun main(arg:Array<String>)
{
    // immutable map
    /*
    Map is a data structures which will store data in key value pair
    each value is associate woth key
     */

    var Mymap = mapOf<Int,String>(1 to "a", 2 to "b" , 3 to "c")  // Immutable , fixedsize , ReadOnly
    print(Mymap.get(2))

    for(index in Mymap.keys) {
        print(Mymap[index])

        println("index: "+Mymap.get(index))
    }


    // Mutable map

    var hashmap = HashMap<Int,String>()// Immutable , fixedsize , ReadOnly

hashmap.put(0,"0")
    hashmap.put(1,"1")
    hashmap.put(2,"2")
    for(index in hashmap.keys) {

        println("index hashmap: "+hashmap.get(index))
    }
// mutable MapOf will return linked hash map

}