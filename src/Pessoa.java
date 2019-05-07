
public class Pessoa {
    private String nome;
    private Data dataNasc;
    
    public String getNome(){
        return this.nome; 
    }//
    public void setNome(String n){
        this.nome=n; 
    }//
    public Data getDataNasc(){
        return this.dataNasc; 
    }//
    public void setDataNasc(int d,int m,int a){
        this.dataNasc.setDia(d);
        this.dataNasc.setMes(m);
        this.dataNasc.setAno(a);
    }
    
    void mostrar(){
        System.out.println(this.nome);
        dataNasc.mostrar();
    }    
}
