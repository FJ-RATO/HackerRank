def f(arr:List[Int]):List[Int] = {
    arr.foldLeft(List[Int]()){(t,h) => h::t}
  }
