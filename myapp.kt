/*
実行手順
➜  kotlin_lessons kotlinc myapp.kt -include-runtime -d myapp.jar
➜  kotlin_lessons ls
myapp.jar myapp.kt
➜  kotlin_lessons java -jar myapp.jar
Hello world
➜  kotlin_lessons
*/


// アクセス修飾子
// - public　どこからでも
// - protected そのクラス + サブクラス
// - private そのクラス

class AdminUser(name: String): User(name) {
  fun sayHello() {
    print("hello, $name")
  }

  override fun sayHi() {
    print("hi, $name")
  }

}

/*open class User(public var name: String) { // コンストラクタ引数*/
/*open class User(protected var name: String) { // コンストラクタ引数*/
open class User(private var name: String) { // コンストラクタ引数
  /*var name = "Me!"*/
  var team = "red"

  // getter
  /*get() {
    return field.toUpperCase()
  }*/
  get() = field.toUpperCase()

  //setter
  set(value) {
    if (value != "") {
      field = value
    }
  }

  init {
    println("instance created: name: $name, team: $team")
  }
   open fun sayHi() {
    print("hi, $name")
  }
}

fun main(args: Array<String>) {
  val adminUser = AdminUser("tom") // インスタンス
  adminUser.sayHello()
  adminUser.sayHi()
}
