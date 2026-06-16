package projetoPOO;
public class Pedido {
    private Produto produto; 
    private int quantidade;
    
    public Pedido () {
     this.produto = null;
     this.quantidade =0 ;
    }

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
       public double calcularPrecoFinal (int qntdPedido , Produto produto) {
           double precoFinal = qntdPedido * produto.getpreco();
           return precoFinal;
       }
       public int calcularFrete (int qntdPedido, Categoria categoria){
        if (qntdPedido > 5 ){
            return 0;
        } if (categoria.getNome().equalsIgnoreCase("bolos") && quantidade > 1 ) {
            return 0;
        }
        return 5;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
   
}
