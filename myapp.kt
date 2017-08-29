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
  /*val users: Map<String, Int> = mapOf("a" to 40, "b" to 80)*/
  /*val users = mapOf("a" to 40, "b" to 80)*/
  val users = mutableMapOf("a" to 40, "b" to 80)
  users["a"] = 60
  println(users.size)
  println(users.keys)
  println(users.values)
  println(users.entries)
}
