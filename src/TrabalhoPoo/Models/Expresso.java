package TrabalhoPoo.Models;

import TrabalhoPoo.Excecao.PrecoInvalidoException;

public class Expresso extends Remetente implements Encomenda,PrecoBase{
    //  private localdate date;
    private double precoBase;
    private double peso;

    Expresso(String nome, String telefone,double precoBase, double peso){
        super(nome,telefone);
        try{
            if (precoBase < 0 ){
                // não sei
            }
        } catch (PrecoInvalidoException e){ System.out.println("erro:"+ e.getMessage);}

        this.precoBase = precoBase;
        this.peso = peso;
    }


    @Override
    public double FreteEncomenda(){
        if (peso > 10){
            return precoBase + (15 * (peso - 10));
        }
        return precoBase ;
    }

    @Override
    public double PesoEncomenda() {
        return peso;
        }

}
