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

  val x = 10
  println(x / 3) // 3
  println(x / 3.0) // 3.33333333...
  println(x % 3) // 1

  var y = 5
  y++
  println(y)

  var z = 4
  z += 12

  val flag = true
  println(!flag)
}
