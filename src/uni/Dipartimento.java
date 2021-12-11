package uni;

public class Dipartimento {
    private String nome;
    private Facolta[] arr;
    public Dipartimento(String nome){
        this.nome=nome;
        arr=new Facolta[2];
    }
    public Dipartimento(String nome, Facolta[] arr){
        this.nome=nome;
        this.arr=new Facolta[arr.length+2];
        for(int i=0;i<arr.length;i++)
            this.arr[i]=arr[i].getNewIstance();
    }
    private int getFree(){
        int i=0;
        while(i<arr.length && arr[i++]!=null);
        return i==arr.length ? -1 : i;
    }
    private void resize(){
        Facolta[] arr2=new Facolta[(int)Math.ceil(0.2*arr.length)];
        for (int i = 0; i < arr.length; i++)
            arr2[i]=arr[i];
        arr=arr2;
    }
    public void addFacolta(Facolta in){
        int free=getFree();
        if(free==-1){
            free=arr.length;
            resize();
        }
        arr[free]=in.getNewIstance();
    }
    public String iscrivi(String facolta)throws Exception{
        int i=indexOf(facolta);
        if(i==-1)
            throw new Exception("facolta inesistente");
         return arr[i].getNome().substring(2)+arr[i].getNewMatricola();
    }
    public String getNome(){
        return nome;
    }
    private int indexOf(String nome){
        int i=0;
        while(i<arr.length && !arr[i++].getNome().equals(nome));
        return i==arr.length? -1: i;
    }
    public boolean contains(String facolta){
        return indexOf(facolta)!= -1;
    }
}
