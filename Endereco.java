
 package projetoPOO;

public class Endereco {
    private String rua;
    private String cidade;
    private String bairro;
    private String cep;
    private int numero;
    
    public Endereco (){
        this.rua = "nd";
        this.cidade = "nd";
        this.bairro = "nd";
        this.cep = "nd";
        this.numero = 0;
    }

    public Endereco( String cep,String cidade, String bairro,String rua, int numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }

    //metodos 
        public String imprimirEndereco(){
            String end = "Rua:  " + rua +"\nCidade: " + cidade + "\nBairro: " + "\nnumero: " + numero ;
            return end ;
        }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
