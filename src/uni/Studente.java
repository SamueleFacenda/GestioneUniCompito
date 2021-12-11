package uni;


public class Studente  extends Persona{
    String matricola;
    String tipoLaurea;
    int annoImmatricolazione;
    int annoLaura;

    public Studente() {
    }

    public Studente(String nome, String cognome, String codiceFiscale, String dataDiNascita, String matricola, String tipoLaurea, int annoImmatricolazione, int annoLaura) {
        super(nome, cognome, codiceFiscale, dataDiNascita);
        this.matricola = matricola;
        this.tipoLaurea = tipoLaurea;
        this.annoImmatricolazione = annoImmatricolazione;
        this.annoLaura = annoLaura;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }


}
