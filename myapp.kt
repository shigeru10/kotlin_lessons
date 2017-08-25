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

  /*val -> 変更不可, var -> 変更可能*/
  val msg: String = "Hello world" // 型は省略可能
  println(msg)
}
