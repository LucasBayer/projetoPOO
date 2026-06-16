
   package projetoPOO;
   
import java.util.ArrayList;
import java.util.List; 
   
public class Categoria {
    private List<Produto> produto;
    private String nome;
    
    public Categoria (){
     this.produto = null;
     this.nome = "ND";
    }

    public Categoria(String nome) {
       this.produto = new ArrayList<>(); // cria um vetor vazio, mas que nao precisa de uma variavel de controle pois ele se expande sozinho
        this.nome = nome;
    }
    //CRUD
    public void adcionarProdutos(Produto produto){  //metodo para adcionar produto ao vetor
        produto.setCategoria(this);
        this.produto.add(produto);
    }
    
    public void removerProdutos (Produto produto){ //metodo para remover 
          this.produto.remove(produto);
    }
    public void alterarProdutos (int posicao,Produto produto){ //metodo para alterar o produto
        this.produto.set(posicao , produto);
    }
    public String imprimirProdutos(){// metodo para imprimir todos os produtos do vetor
        String lista = "";
        for (Produto p : this.produto ){
           lista += p.getNome() +"\n" ;
        }
        return lista;
    }    
    //fim do crud
    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    }

