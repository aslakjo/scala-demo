
class Teller {
    var teller = (x:Int) => x+1
}

val teller = new Teller
println(teller.teller(2))

teller.teller = (x:Int) => x*3
println(teller.teller(2))
