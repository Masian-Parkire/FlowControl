fun main() {
numbers()
    var take = getNames(arrayOf("AkiraChix","busy","smart","function","Mutesiiii",))
 println(take)
    serve(45)
    serve(4)
    serve(14)
    serve(6)
    getnumbers()

}

fun numbers(){
  for (num in 1..100){
      if (num%2!=0){
          println(num)
      }
  }

}
fun getNames(tag:Array<String>):Int{
    var num = 0
    tag.forEach { t ->
        if (t.length>5){
            num ++
        }
    }
    return num
}
fun serve(age:Int){
    if (age<6){
       println("serve glass of milk")
    }
    else if (age in 7..14){
        println("serve bottle of fanta Orange")
    }
    else{
     println("Serve a bottle of Cocacola")
    }

}
fun getnumbers() {
    for (numb in 1..100) {
        if (numb % 3 == 0 && numb % 5 == 0){
            println("FizzBuzz")
        }
        else if (numb%3 == 0)   {
            println("Fizz")
        }
        else if (numb%5 == 0){
            println("Buzz")
        }
        else{
            println(numb)
        }
    }

}







