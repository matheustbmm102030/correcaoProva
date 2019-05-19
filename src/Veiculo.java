
public class Veiculo {
    private Pessoa proprietario;
    private Data DataAquisicao;
    private String finalidade;
    
    public Pessoa getProp(){
        return this.proprietario; 
    }//
    public void setProp(Pessoa n){
        this.proprietario=n; 
    }//
    public Data getDataAqui(){
        return this.DataAquisicao; 
    }//
    public void setDataAqui(Data d){
        this.DataAquisicao=d;
    }
    
    
    void mostrar(){
        System.out.println(this.finalidade);
        this.proprietario.mostrar();
        this.DataAquisicao.mostrar();
    }
    boolean informarFinalidade(String stg){
        this.finalidade=stg;
        if((stg.equals("passeio"))||(stg.equals("diplomacia"))||(stg.equals("aluguel"))){
            return true;
        }
        else{
            return false;
        }
        
    }
}
