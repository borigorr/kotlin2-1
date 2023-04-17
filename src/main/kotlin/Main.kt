fun main(args: Array<String>) {
    val likes: UInt = 21u
    val likesString = likes.toString()
    val endEleven = likesString.endsWith("11");
    val endOne = likesString.endsWith("1");
    val peoplesString = if (!endEleven && endOne) {"человеку"} else {"людям"}
    println("Понравилось $likes $peoplesString")
}