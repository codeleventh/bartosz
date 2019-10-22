class Chapter1Scala {
  def id(x: Any): Any = x

  def compose[I, R, O](f: R => O, g: I => R): (I => O) = {
    x => f.apply(g(x))
  }
}
