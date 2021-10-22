fun main(args: Array<String>) {
// var myComputer: ComputerX = Nexus()
//    println(myComputer.computerName)
//   var myNexus: Nexus = ComputerX()
}

open class ComputerX {
    var computerName: String = "Nexus"
}
class Nexus: ComputerX() {

}