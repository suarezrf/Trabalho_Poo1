package TrabalhoPoo.Models;
// import localdate;
public class Economico extends Remetente implements Encomenda,PrecoBase{
//  private localdate date;
    private double precoBase;
    private double peso;

    Economico(String nome, String telefone,double precoBase, double peso){
        super(nome,telefone);
        this.precoBase = precoBase;
        this.peso = peso;
    }
    @Override
    public double FreteEncomenda(){
        return precoBase;
    }

    @Override
    public double PesoEncomenda() {
        return peso;}


}
