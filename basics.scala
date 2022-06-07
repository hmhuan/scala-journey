println("Hello world")

println(1 + 1)

// values
val x: Int = 1 + 1
println(x)

// x = 3 // value cannot be re-assigned
println(x)

// variables
var y: Int = 1 + 2
println(x + y)

y = 4
println(x + y)

// blocks
println({
  val x = 1
  x + 2
})

// functions
val addOne = (x: Int) => x + 1
println(addOne(y))

val add = (x: Int, y: Int) => {
  x + y
}
println(add(x, y))

// methods
def add(x: Int, y: Int): Int = x + y
println(add(3, 4))

def addThenMultiply(x: Int, y: Int)(multplier: Int): Int = (x + y) * multplier
println(addThenMultiply(1, 2)(3))

def name: String = System.getProperty("user.name") // no parameters
println(name)

// classes

class Greeter(prefix: String, sufix: String) {
  def greet(name: String): Unit = println(prefix + name + sufix)
}

val greeter = Greeter("Hello", "!")
greeter.greet("devloper")

// case class
case class Point(x: Int, y: Int)

val point = Point(1, 2)
val anotherPoint = Point(1, 2)
val otherPoint = Point(1, 2)

if (point == anotherPoint) {
  println(s"$point and $anotherPoint are the same.") // this will be triggered
} else {
  println(s"$point and $anotherPoint are different.")
}

if (point == otherPoint) {
  println(s"$point and $otherPoint are the same.")
} else {
  println(s"$point and $otherPoint are different.") // this will be triggered
}

// objects - singletons of their own classes
object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

val newId: Int = IdFactory.create()
println(newId) // 1
val newerId: Int = IdFactory.create()
println(newerId) // 2

// traits
// default implementation
trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends Greeter

class CustomGreeter(prefix: String, sufix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter = new DefaultGreeter()
greeter.greet("developer")

val customGreeter = new CustomGreeter("How are you, ", "?")
customGreeter.greet("developer")

// Main method
object Main {
  def main(args: Array[String]): Unit = 
    println("Hello wordl!")
}