package uni;

public class Universita {
    private Dipartimento[] arrDip;
    private Persona[] iscritti;
    private String nome;
    public Universita(String nome){
        this.nome=nome;
        arrDip=new Dipartimento[2];
        iscritti=new Persona[2];
    }
    public Universita(String nome,Persona[] persone, Dipartimento[] dip){
        this.nome=nome;
        iscritti=new Persona[persone.length+2];
        for (int i = 0; i < persone.length; i++)
            iscritti[i]=persone[i].getNewIstance();
        arrDip=new Dipartimento[dip.length+2];
        for (int i = 0; i < dip.length; i++)
            arrDip[i]=dip[i].getNewIstance();
    }
    private int getFreePerson(){
        int i=0;
        while(i<iscritti.length&& iscritti[i++]!=null);
        return i==iscritti.length? -1:i;
    }
    private int getFreeDip(){
        int i=0;
        while(i<arrDip.length&& arrDip[i++]!=null);
        return i==arrDip.length? -1:i;
    }
    private int indexOfDip(String nome){
        int i=0;
        while(i<arrDip.length && !nome.equals(arrDip[i++].getNome()));
        return i==arrDip.length?-1:i;
    }
    private int indexOfPersona(String codiceFIscale){
        int i=0;
        while(i<iscritti.length && !codiceFIscale.equals(iscritti[i++].getCodiceFiscale()));
        return i==iscritti.length?-1:i;
    }
    public void iscrivi(String nomeDip,String facolta,String codiceFiscale)throws Exception{
        int dip=indexOfDip(nomeDip);
        if(dip==-1)
            throw new Exception("dipartimento inesisitente");
        int stud=indexOfPersona(codiceFiscale);
        if(stud==-1 || !( iscritti[stud] instanceof Docente))
            throw new Exception("studnte non trovato");
        ((Studente)iscritti[stud]).setMatricola(arrDip[dip].getNome().substring(2)+arrDip[dip].iscrivi(facolta));
    }
    public Studente getStudente(String codiceFiscale)throws Exception{
        int stud=indexOfPersona(codiceFiscale);
        if(stud==-1 || !( iscritti[stud] instanceof Docente))
            throw new Exception("studnte non trovato");
        return iscritti[stud].getNewInstance();
    }
}
