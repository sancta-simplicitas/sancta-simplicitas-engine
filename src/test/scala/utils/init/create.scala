package utils.init

import java.io.File

object create {
    def init() {
        initDir()
    }
    def initDir() {
        mkDir("./assets/character")
        mkDir("./assets/view")
    }
    def mkDir(path: String) {
        new File(path).mkdirs()
    }
}