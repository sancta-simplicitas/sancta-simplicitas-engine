package utils.character

trait Generator {
    val uuid: String
    var name: String

    def whoami() {
        println("$uuid $name")
    }
}