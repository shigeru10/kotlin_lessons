/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/


// Interface
// delegateのようなもの, classに複数適用可能

interface Sharable {
  // 抽象プロパティ
  val version: Double
  // 抽象メソッド
  fun share()
  // メソッド
  fun getInfo() {
    println("Share I/F ($version)")
  }
}

class User: Sharable {
  override val version = 1.1
  override fun share() {
    println("Sharing...")
  }
}


fun main(args: Array<String>) {
  val user = User()
  user.share()
  user.getInfo()
}
