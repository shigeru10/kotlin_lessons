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
  // for

  // break
  // continue

  for (i in 0..9) {
    if (i == 5) break
    if (i == 3) continue
    println(i)
  }
}
