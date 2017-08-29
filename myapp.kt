/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// Collection

/*
- List(Immutable/Mutable) -> 順番をもつデータの集合
- Set(Immutable/Mutable)  -> 順番を持たない、重複しない集合
- Map(Immutable/Mutable)  -> キーと値でデータを管理していく集合
*/

fun main(args: Array<String>) {
  /*val sales: List<Int> = listOf(20, 30, 40)*/
  val sales = mutableListOf(20, 30, 40) // mutableの場合、型つけるとエラー
  println(sales[1])
  sales[1] = 50
  println(sales.size)
  for (sale in sales) {
    println(sale)
  }

}
