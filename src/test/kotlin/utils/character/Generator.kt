package utils.character

import com.google.gson.Gson
import model.Character

interface Generator {
    val uuid: String
    var name: String

    fun whoami() {
        println("$uuid $name")
    }
}