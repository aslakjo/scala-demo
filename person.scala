class Person(val navn:String, val etternavn:String, val alder:Integer)
{
    val fulltNavn = navn + " " + etternavn
}

val person = new Person("aslak", "johannessen", 25)

println(person.fulltNavn)
