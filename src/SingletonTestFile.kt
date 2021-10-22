fun main(args: Array<String>) {

    var mySamsungGalaxy = SamsungGalaxy.theOnlyGalaxyInstance
    mySamsungGalaxy.name = "How are you"
    println(mySamsungGalaxy.name)
    var mySecondGalaxy = SamsungGalaxy.theOnlyGalaxyInstance
    mySecondGalaxy.name = "Who am I"

    println(mySecondGalaxy.name)

}

class SamsungGalaxy {
    var name: String = "Galaxy S8"

    private constructor() {
        println("$name is created ----->")
    }

    companion object {
        val theOnlyGalaxyInstance: SamsungGalaxy by lazy {SamsungGalaxy()}
    }
}