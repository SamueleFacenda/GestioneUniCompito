package uni;

/**
 * classe per il salvataggio di una facolta, con l'assegnazione del numero di matricola
 * @author samuele facenda
 */
public class Facolta {
    private String nome,tipo;
    private int newMatricola;

    /**
     * costruttore con tutti i parametri
     * @param nome nome della facolta
     * @param tipo tipo di facolta
     * @param newMatricola matricola d'inizio
     */
    public Facolta(String nome, String tipo, int newMatricola) {
        this.nome = nome;
        this.tipo = tipo;
        this.newMatricola = newMatricola;
    }

    /**
     * autoesplicativo
     * @return nome della facolta
     */
    public String getNome() {
        return nome;
    }

    /**
     * autoesplicativo
     * @return tipo di faoclta
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * ritnorna una nuova matriocola e incrementa ail contatore
     * @return
     */
    public int getNewMatricola() {
        return newMatricola++;
    }

    /**
     * crea una nuova istanza dell'oggetto
     * @return
     */
    public Facolta getNewIstance(){
        return new Facolta(nome,tipo,newMatricola);
    }
}
