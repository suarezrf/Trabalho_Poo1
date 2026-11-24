package TrabalhoPoo.Models;

public class Remetente {
    private String nome;
    private String telefone;

    Remetente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
}
