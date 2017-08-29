/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// generics
// 引数の型を決めなくて良い。汎用化できる。

/*class MyInteger {
  fun getThree(x: Int) {
    println(x)
    println(x)
    println(x)
  }
}*/

class MyData<T> {
  fun getThree(x: T) {
    println(x)
    println(x)
    println(x)
  }
}

fun main(args: Array<String>) {
  /*val mi = MyInteger()
  mi.getThree(55)*/

  val i = MyData<Int>()
  i.getThree(4)
  val s = MyData<String>()
  s.getThree("hi")
}
