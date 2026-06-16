
 package projetoPOO;

public class Proprietario implements FazerEncomenda {
    private Pessoa pessoa;
    private Confeitaria confeitaria;
    
    public Proprietario () {
        this.pessoa = null;
        this.confeitaria = null;
    }

    public Proprietario(Pessoa pessoa, Confeitaria confeitaria) {
        this.pessoa = pessoa;
        this.confeitaria = confeitaria;
    }
    
     @Override
    public Pedido FazerPedido (Produto produto , int quantidade){
        Pedido pedido = new Pedido (produto , quantidade);  
        return pedido;
    };
    
   
    
   @Override 
    public String visualizarPedidos(Pedido pedido){
        int indice = 0;
       return "Produto: " + pedido.getProduto() + "\nquantidade: "+ pedido.getQuantidade()+ "para Categoria:" + confeitaria.getCategoria(indice) ;
    };
    
}
