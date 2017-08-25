/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/


/*fun sayHi(): String {
  return "hi!"
}*/

// 一行の時は、式のように書ける
fun sayHi() = "hi!"

fun main(args: Array<String>) {
  val msg = sayHi()
  println(msg)
}
