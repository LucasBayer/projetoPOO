package projetoPOO;

public class Produto {
    private String nome;
    private String tamanho;
    private double preco;
    private Categoria categoria;

    public Produto (){
        this.nome = "nd";
        this.tamanho = "nd";
        this.preco = 0;
        this.categoria = null;
        
    } 
    
    public Produto(String nome, String tamanho, double preco, Categoria categoria) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
        this.categoria = categoria;
        
    }
    //metodos 
    
    public String imprimirInfoProduto (){
        String produto ="Nome: " + nome +"tamanho: " + tamanho +"preco: "+ preco +" categoria: "+ categoria ;
        return produto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getpreco() {
        return preco;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}

