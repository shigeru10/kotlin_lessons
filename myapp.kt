/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// null

fun main(args: Array<String>) {
  /*val s: String = null*/
  val s: String? = null // nullable
  /*println(s)*/

  /*if (s != null) {
    println(s.length)
  } else {
    println(null)
  }*/

  /*println(s?.length)*/

  /*println(s?.length ?: -1)*/

  println(s!!.length) // 以下のエラーが返ってくる
  /*Exception in thread "main" kotlin.KotlinNullPointerException
	at MyappKt.main(myapp.kt:28)*/
}
