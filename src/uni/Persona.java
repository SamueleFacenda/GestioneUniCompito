package uni;

public class Persona {
    String nome;
    String cognome;
    String codiceFiscale;
    String dataDiNascita;

    public Persona(String nome, String cognome, String codiceFiscale, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.dataDiNascita = dataDiNascita;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }
}
