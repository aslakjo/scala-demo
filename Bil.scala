
class Bil(val registreringsNummer:String) {
  override def toString= registreringsNummer
}

trait KranBil{
  def harKran = true
}

class ArbeidsBil(val regnr:String) extends Bil(regnr) with KranBil{}

val onkelsBil = new Bil("bn 676767") with KranBil
println("onkels: " + onkelsBil + " har kran: " + onkelsBil.harKran )

val minBil = new Bil("tv 23232")
//println(minBil.harKran) <-- kompilerings feil: error: value harKran is not a member of this.Bil

val jobbensBil = new ArbeidsBil("re 23232")
println("jobbens: " + jobbensBil + " har kran: " + jobbensBil.harKran )