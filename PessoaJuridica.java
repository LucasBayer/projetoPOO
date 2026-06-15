/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package projetoPOO;
import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
 private String cnpj;
    private String razaoSocial;
    private LocalDate dataAbertura;
//Construtores
    public PessoaJuridica() {
        super();
        this.cnpj = "ND";
        this.razaoSocial = "ND";
        this.dataAbertura = null;
    }

    public PessoaJuridica(String cnpj, String razaoSocial,LocalDate dataAbertura , String nomeCompleto, String email, Telefone telefone, Endereco endereco) {
        super(nomeCompleto, email, telefone, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.dataAbertura = dataAbertura;
    }
   //Metodos 
    
    
      public String imprimirInformacoes(){ //vai retornar as informaçoes  da pessoa 
        return  "PlaceHolder" ; 
    }
      
      
    //FALTA AS VALIDAÇOES DOS SETs

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
