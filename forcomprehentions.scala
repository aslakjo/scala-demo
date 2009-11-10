
val tekst = List("en", "to", "tre", "fire", "fem", "seks", "syv", "åte", "ni", "ti")

val utvalg = for(tall <- tekst
     if(tall.startsWith("t") || tall.startsWith("f"));
     if(tall.length <= 3)
	) yield tall

println(utvalg)