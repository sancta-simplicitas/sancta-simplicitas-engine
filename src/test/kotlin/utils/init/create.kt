package utils.init

import java.io.File

fun init() {
    initDir()
}
fun initDir() {
    mkDir("./assets/character")
    mkDir("./assets/view")
}
fun mkDir(path: String) {
    File(path).mkdirs()
}