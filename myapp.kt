/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// 抽象クラス -> 具象クラス
// User -> Japanese, American

abstract class User {
  abstract fun sayHi()
}

class Japanese: User() {
  override fun sayHi() {
    println("こんにちは！")
  }
}

class American: User() {
  override fun sayHi() {
    println("Hi!")
  }
}

fun main(args: Array<String>) {
  val japanese = Japanese()
  val american = American()

  japanese.sayHi()
  american.sayHi()
}
