package uni;

public class Docente extends Persona{
    String tipo;
    String[] laurea;

    public Docente(String nome, String cognome, String codiceFiscale, String dataDiNascita, String tipo, String laurea[]) {
        super(nome, cognome, codiceFiscale, dataDiNascita);
        this.laurea=laurea;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getLaurea() {
        return laurea;
    }

    public void setLaurea(String[] laurea) {
        this.laurea = laurea;
    }
}
