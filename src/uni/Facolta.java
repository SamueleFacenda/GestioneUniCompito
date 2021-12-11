package uni;

public class Facolta {
    private String nome,tipo;
    private int newMatricola;

    public Facolta(String nome, String tipo, int newMatricola) {
        this.nome = nome;
        this.tipo = tipo;
        this.newMatricola = newMatricola;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNewMatricola() {
        return newMatricola++;
    }
    public Facolta getNewIstance(){
        return new Facolta(nome,tipo,newMatricola);
    }
}
