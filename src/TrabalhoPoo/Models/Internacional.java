package TrabalhoPoo.Models;

public class Internacional extends Remetente implements Encomenda,PrecoBase{
    //  private localdate date;
    private double precoBase;
    private double peso;

    Internacional(String nome, String telefone,double precoBase, double peso){
        super(nome,telefone);
        this.precoBase = precoBase;
        this.peso = peso;}

    @Override
    public double PrecoBase(){
        return precoBase * 2.5;
    }

    @Override
    public double PesoEncomenda() {
        return peso;
    }
}
