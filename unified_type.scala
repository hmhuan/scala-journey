val list: List[Any] = List (
    "a string",
    732,
    'v',
    true,
    () => "an anonymous function return a string"
)

list.foreach(e => println(e))

// type casting
val x: Long = 982173231
val y: Float = x

val face: Char = '☺'
val numFace: Int = face
// casting is undirectional

// Nothing and Null
