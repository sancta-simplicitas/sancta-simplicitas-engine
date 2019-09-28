package utils.assets.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import model.Character
import model.View
import java.io.File

interface Writer {
    val uuid: String

    fun save() {
        uuid.let()
        var path = "./assets/"
        val jsonString :String = GsonBuilder()
                                .setPrettyPrinting()
                                .create()
                                .toJson(this)
        when {
            this is Character   -> path += "character"

            this is View -> path += "view"
        }
        path += "/$uuid.json"
        File(path).writeText(jsonString)}
}