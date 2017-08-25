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
  // when
  val num = 3

  when (num) {
    0 -> println("Zero")
    1 -> println("One")
    2, 3 -> println("Two or Three")
    in 4..10 -> println("Many")
    else -> println("other")
  }

  // 変数にも代入できる
  val result = when (num) {
    0 -> "Zero"
    1 -> "One"
    2, 3 -> "Two or Three"
    in 4..10 -> "Many"
    else -> "other"
  }
}
