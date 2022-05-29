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
