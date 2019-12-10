package model

import utils.character.Generator
import utils.assets.json.Writer
import java.util.UUID

class Character(override var name: String = "Baka9") extends Generator with Writer {
    override val uuid: String = UUID.randomUUID().toString
}
