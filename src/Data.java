
public class Data {
    private int dia,mes,ano;
    
    public int getDia(){return this.dia; }
    public void setDia(int d){this.dia=d; }
    public int getMes(){return this.mes; }
    public void setMes(int m){this.mes=m; }
    public int getAno(){return this.ano; }
    public void setAno(int a){this.ano=a; }
    
    
    void mostrar(){
        System.out.println(getDia()+"/"+getMes()+"/"+getAno());
    }
}
