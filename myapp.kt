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
  /*val answers: Set<Int> = setOf(2, 3, 4, 2)*/
  /*val answers = setOf(2, 3, 4, 2)*/
  val answers = mutableSetOf(2, 3, 4, 2)
  answers.add(5)
  answers.remove(4)
  println(answers)
  println(answers.contains(3)) // true

  val set1 = setOf(1, 3, 5, 8)
  val set2 = setOf(3, 5, 8, 9)

  println(set1.intersect(set2))
  println(set1.union(set2))
  println(set1.subtract(set2))
}
