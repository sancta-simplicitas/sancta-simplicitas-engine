package utils.assets.json

import com.google.gson.GsonBuilder
import model.Character
import model.View
import java.io.File

trait Writer {
    val uuid: String

    def save() {
        uuid
        var path = "./assets/"
        val jsonString :String = new GsonBuilder()
                                .setPrettyPrinting()
                                .create()
                                .toJson(this)
        this match {
            case _: Character => path += "character"
            case _: View => path += "view"
        }
        path += "/$uuid.json"
        new File(path).writeText(jsonString)
    }
}