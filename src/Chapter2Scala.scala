class Chapter2Scala {

  class Memoize[A, B] {

    private val map = collection.mutable.Map.empty[A, B]

    def memoizedIsPrime(f: (A => B), arg: A): B = {
        map.getOrElse(arg, {
          map update(arg, f apply arg)
          map(arg)
        })
    }
  }
}