fun main(args: Array<String>) {
    //var animal = Outer()
   //var animal1 = Outer().StaticClass()
    var innerAnimal = Outer().NonStaticClass()
}

class Outer {
    private var anima: String = "Hello"
    init {
        println("I am the Outer Class")
    }
    class StaticClass{
        init {
            println("I am Static Class")
        }
       // private var anima: String = "Hello"
        fun print() {

           // println(anima)
        }
    }

   inner class NonStaticClass{
        // private var anima: String = "Hello"
       init {
           println("I am NonStaticClass")
       }
        fun print() {

            println(anima)
        }
    }
}