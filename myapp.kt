/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// data class
// データを保持するだけのクラスにはdataをつける

/*class Point(val x: Int, val y: Int)*/
data class Point(val x: Int, val y: Int)

fun main(args: Array<String>) {
  val p1 = Point(3, 5)
  val p2 = p1.copy()
  /*val p2 = Point(3, 5)*/

  println(p1)
  println(if (p1 == p2) "same" else "not same")

  val (x,y) = p1
  println("$x:$y")
}
