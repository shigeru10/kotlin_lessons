/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/

// Class
// - data: property
// - fun: method


class User(var name: String) { // コンストラクタ引数
  /*var name = "Me!"*/
  var team = "red"
  init {
    println("instance created: name: $name, team: $team")
  }
  fun sayHi() {
    print("hi, $name")
  }
}

fun main(args: Array<String>) {
  val user: User = User("tom") // インスタンス
  println(user.name)
  user.sayHi()
}
