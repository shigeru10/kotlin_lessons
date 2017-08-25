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

  val msg: String = "Hello world" // 文字列型
  val c: Char = 'a' // <- 文字型

  // Byte, Short, Int, Long
  val i: Int = 100
  val i: Long = 5555555555555555L // <- 終わりに'L'をつける

  // Float, Double
  val d: Double = 234.234
  val f: Float = 12.234F // <- 終わりに'F'をつける

  // Boolean
  val flag: Boolean = true

}
