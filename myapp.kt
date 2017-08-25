/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

fun sayHi(name: String = "taguchi", age:Int = 23) {
  println("hi! $name ($age)")
}

fun main(args: Array<String>) {
  sayHi()
  sayHi("Tom", 22)
  sayHi(age = 19, name = "steve")
}
