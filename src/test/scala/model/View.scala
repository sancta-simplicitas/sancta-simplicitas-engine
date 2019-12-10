package model

import utils.assets.json.Writer
import utils.view.Generator
import java.util.UUID
import scala.collection.mutable.ListBuffer

class View(var viewname: String = "Gensokyo") extends Writer with Generator  {
    override val uuid: String = UUID.randomUUID().toString
    override var scene: ListBuffer[Scene] = ListBuffer()
    class Scene(
        var choice: List[Any],
        var dialog: List[Any]
    )
}


