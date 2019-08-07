import tornadofx.*

class MyApp: App(MyView::class)

class MyView: View() {
    override val root = vbox {
        label("Hello, World!")
    }
}

fun main(args: Array<String>) {
    launch<MyApp>(args)
}