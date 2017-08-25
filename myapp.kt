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
  // while

  var i = 0

  while (i < 10) {
    println("loop: $i")
    i++
  }

  // あと判定なので、最初の一回は条件に関係なく実行される
  do {
    println("loop: $i")
    i++
  } while(i < 10)
}
