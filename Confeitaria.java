
 package projetoPOO;

public class Confeitaria {
    private Categoria categorias[];
    private String nome;
    private Proprietario proprietario;
    private Endereco endereco;
    private String telefone;

    public Confeitaria(String nome, Proprietario proprietario, Endereco endereco, String telefone) {
        this.categorias = new Categoria[3]; //apenas inicializo o vetor categoria
        this.nome = nome;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    
    //preciso mudar esse get
    public String getCategoria(int i) {
        if (i >= 0 && i< categorias.length ) {
         return categorias[i].getNome();
        } return "indice invalido";
    }

    public void setCategorias(Categoria categoria, int controle) {
        this.categorias[controle] = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
       
    
}
