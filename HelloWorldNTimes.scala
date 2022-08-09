def f(limit:Int)={
    def facc(acc:Int,limit:Int):Boolean={
        if(acc == limit){
            false
        } 
        else{
            println("Hello World")
            facc(acc+1,limit)
        }
    }
    if (limit>=0 && limit <= 50) facc(0,limit)
