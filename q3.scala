object q3 {
  def main(args: Array[String]): Unit = {

    val toUpper: (String, Int, Int) => String = (name, startIndex, endIndex) => {
      var modifiedName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifiedName.charAt(i).toUpper
        modifiedName = modifiedName.updated(i, convertWord)
      }
      modifiedName
    }

    val toLower: (String, Int, Int) => String = (name, startIndex, endIndex) => {
      var modifiedName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifiedName.charAt(i).toLower
        modifiedName = modifiedName.updated(i, convertWord)
      }
      modifiedName
    }

    val formatName: (String, Int, Int, (String, Int, Int) => String) => String = (name, startIndex, endIndex, f) => {
      f(name, startIndex, endIndex)
    }

    println("Enter the name: ")
    val name = scala.io.StdIn.readLine()

    println("Enter the start index: ")
    val startIndex = scala.io.StdIn.readInt()

    println("Enter the end index: ")
    val endIndex = scala.io.StdIn.readInt()

    val resultU = formatName(name, startIndex, endIndex, toUpper)
    //val resultL = formatName(name, startIndex, endIndex, toLower)

    println(resultU)
    //println(resultL)
  }
}
