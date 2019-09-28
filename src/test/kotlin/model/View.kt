package model


import utils.assets.json.Writer
import utils.view.Generator
import java.util.*

class View(var viewname:String = "Gensokyo"):Writer,Generator  {
    override val uuid:String = UUID.randomUUID().toString()
    override var scene: List<Scene> = arrayListOf()
    data class Scene(
        var choice: List<Any>,
        var dialog: List<Any>
    )
}


