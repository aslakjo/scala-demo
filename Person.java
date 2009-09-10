
public class Person {

    private final String navn;
    private final String etternavn;
    private final int alder;

    private final String fulltNavn;

    public Person(String navn, String etternavn, int alder)
    {
        this.navn = navn;
        this.etternavn= etternavn;
        this.alder = alder;

        this.fulltNavn = navn + " " + etternavn;
    }

    public String getNavn() { return navn; }
    public String getEtternavn() { return etternavn; }
    public int getAlder() { return alder; }
    public String getFulltNavn() { return fulltNavn; }
}


