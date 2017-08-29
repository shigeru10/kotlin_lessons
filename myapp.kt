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
  val prices = listOf(53.2, 48.9, 32.6)
  prices
    /*.map { n -> n * 1.08 } // 引数 -> 処理*/
    .map { it * 1.08 } // 暗黙の引数
    /*.filter { n -> n > 50 }*/
    .filter { it > 50 }
    .forEach { println(it) }
}
