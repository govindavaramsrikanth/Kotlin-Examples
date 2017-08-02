/**
 * Created by govinds on 8/2/2017.
 */


fun main(arg: Array<String>)
{

var person = Person()
    person.name="Srikanth"
    person.age=29

    println("person details Name: ${person.name} \n Age: ${person.age}")

    with(person){

       name="AnaghaSree"
       age=2
    }

    println("person details Name: ${person.name} \n Age: ${person.age}")


    person.apply {

        name="Tulasi"
        age=26
    }.nameOfPerson()
}