
 package projetoPOO;
 import java.time.LocalDate;
 
public class Cliente implements FazerEncomenda {
    private Pessoa pessoa;
    private final int codigoCliente; 
    private boolean ativo;
    private LocalDate dataCadastro;
    private static int proximoCodigo = 1; //tipo uma chave primaria
    
    public Cliente () {
        this.pessoa = null;
        this.ativo = false;
        this.codigoCliente = 0;
        this.dataCadastro = null;
    }

    public Cliente(Pessoa pessoa, int codigoCliente, boolean ativo, LocalDate dataCadastro) {
        this.pessoa = pessoa;
        this.codigoCliente = proximoCodigo++;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }

    
    @Override
    public Pedido FazerPedido (Produto produto , int quantidade){
        Pedido pedido = new Pedido(produto,quantidade);
        return pedido;
    };
     @Override 
    public String visualizarPedidos(Pedido pedido){
       return "Produto: " + pedido.getProduto() + "\nquantidade: "+ pedido.getQuantidade();
    };  

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getCodigoCliente() { //apenas get pois o codigo do cliente nao pode mudar
        
        return codigoCliente;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
