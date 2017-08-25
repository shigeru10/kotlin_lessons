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
  // if
  val score = 85

  if (score > 80) {
    println("great")
  } else if (score > 60) {
    println("good")
  } else {
    println("soso ...")
  }

  // 三項演算子のようにかける
  val result = if (score > 80) "Great" else "soso ..."
}
