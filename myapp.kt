/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// 拡張
fun User.sayHello() {
  println("hello, $name")
}

fun User.sayHi() {
  println("[ext] hi, $name")
}

val User.myName: String
  get() = "I am $name"

class User(var name: String) { // コンストラクタ引数
  fun sayHi() {
    println("hi, $name")
  }
}

fun main(args: Array<String>) {
  val tom = User("tom") // インスタンス

  tom.sayHello() // hello, tom
  tom.sayHi() // hi, tom
  println(tom.myName) // I am tom
}
