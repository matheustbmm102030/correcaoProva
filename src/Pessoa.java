
public class Pessoa {
    private String nome;
    private Data dataNasc;
    
    public int getDia(){return this.dia; }
    public int setDia(){return this.dia; }
    public int getMes(){return this.mes; }
    public int setMes(){return this.mes; }
    
    
    void mostrar(){
        System.out.println(getDia()+"/"+getMes()+"/"+getAno());
    }    
}
