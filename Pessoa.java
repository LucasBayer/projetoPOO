package projetoPOO;
 
public abstract class Pessoa {
    private String nomeCompleto; // private String sobrenome; //fazer um metodo que pega a ultima frase da string passa pelo scanner, para o usuario ficar nome + ultimo sobrenome
    private Endereco endereco;
    private String email;
    private String telefone; //uma pessoa pode ter dois telefone...pode ter dois emails?sim, vou implementar outra classe... nao!
    
    public Pessoa () {
     this.endereco = null;
     this.nomeCompleto = "ND";   
     this.email ="ND";
     this.telefone = null;
    }

    public Pessoa(String nomeCompleto,String email, String telefone ,Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco; //INSTANCIAR DENTRO DO CONSTRUTOR PARA FAZER UMA COMPOSIÇAO?
        this.email = email;
        this.telefone = telefone;             
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    //IMPLEMENTAR VALIDAÇAO 
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //FALTA VALIDAÇAO
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }
    //FALTA VALIDAÇAO
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    //falta VALIDAÇAO
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
