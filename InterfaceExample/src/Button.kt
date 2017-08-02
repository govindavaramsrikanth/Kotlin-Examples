/**
 * Created by govinds on 7/25/2017.
 */
class Button : MyInterfaceListener,MySecondInterfaceListener {
    override var name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun onClick() {
super<MySecondInterfaceListener>.onClick()
    }

    override fun onTouch() {

    }
//   override  var name:String="dummyname"
//    override fun onClick() {
//        super.onClick()
//println("Button clicked")
//
//    } // u can comment onclick method as it is not abstract method
//
//    override fun onTouch() {
//
//        println("Button Touched")
//    }
}