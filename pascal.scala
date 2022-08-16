def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   * Computes the value a specific number from the pascal triangle
   * @param c column number (starting at 0)
   * @param r row number (starting at 0)
   * @return (Int) the value computed from a specific tuple (c,r)
   */
  def pascal(c: Int, r: Int): Int = {
    if((c == 0) || (c == r)) 
      1 //the edges of the triangle are always 1
    else
      pascal(c-1,r-1) + pascal(c,r-1) //the classic way to calculate an element is to sum the above numbers (possible using tail ?)
  }
