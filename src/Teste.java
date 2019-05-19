
public class Teste {
    public static void main(String[]Args){
        
        Data d1=new Data();
        d1.setDia(30);
        d1.setMes(2);
        d1.setAno(2053);
        Pessoa p1=new Pessoa();
        p1.setNome("Evangicleyson");
        p1.setDataNasc(d1);
        
        
        Data d2=new Data();
        d2.setDia(32);
        d2.setMes(13);
        d2.setAno(1966);
        Veiculo v1=new Veiculo();
        v1.setDataAqui(d2);
        v1.setProp(p1);
        
        p1.mostrar();
        v1.informarFinalidade("passeio");
        v1.mostrar();

    }
}
