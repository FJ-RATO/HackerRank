  def f(arr:List[Int]):Int ={
    def fAcc(arr:List[Int],acc:Int):Int = arr match{
      case Nil => acc
      case x::xs => {
        if(x%2 != 0) fAcc(xs,acc + x) else fAcc(xs,acc)
      }
    }
    fAcc(arr,0)
  }
