package model

import utils.character.Generator
import utils.assets.json.Writer
import java.util.*

class Character(override var name: String = "Baka9"): Generator,Writer {
    override val uuid = UUID.randomUUID().toString()
}
