
class Person(val navn:String){
    var ektefelle:Person = null
    
    def & (make:Person):Person = {
        val person = new Person(navn)
        person.ektefelle= make
        person
    }

    def + (make:Person):Boolean = (ektefelle == make)
}

var egil = new Person("egil")
var marit = new Person("marit")

var nyEgil = egil & marit

println("egil " + egil)
println("marit "+ marit)
println("nyEgil " + nyEgil)

println("egil + marit = " + (egil + marit))
println("egil + marit = " + (nyEgil + marit))
