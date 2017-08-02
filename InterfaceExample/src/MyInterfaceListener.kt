/**
 * Created by govinds on 7/25/2017.
 */
interface MyInterfaceListener {

    open var name:String
    open fun onClick(){
        println("Interface onclick method")

    }
 fun onTouch() // default it is abstract
}