/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

fun main(args: Array<String>) {
  // 文字列の連結
  println("aaaaaa" + "vbbbbbbbb")

  val name = "aaaaaaaa"
  println("$name")

  println("${12 + 13}")

  println("hello\n world")
}
