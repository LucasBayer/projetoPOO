/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package projetoPOO;
 import java.time.LocalDate;
 import java.time.Period;

public class PessoaFisica extends Pessoa{
  private String cpf;
    private LocalDate dataNascimento;
    
    //construtores
    
    public PessoaFisica(){
    super();
    this.cpf = "ND";
    this.dataNascimento = null;
}  
    public PessoaFisica (String nomeCompleto,String cpf,LocalDate dataNascimento,String email, Telefone telefone ,Endereco endereco ){
        super(nomeCompleto,email,telefone,endereco);
        this.cpf= cpf;
        this.dataNascimento = dataNascimento;
    }
    
    //Metodos 
    
    public int calcularIdade (LocalDate dataNascimento){ //metodo para calcular a idade, caso precise ao inves de apenas a data de nascimento
        int idade = Period.between(dataNascimento,LocalDate.now()).getYears();
        return idade;
    }

    public String imprimirInformacoes(){ //vai retornar as informaçoes  da pessoa 
        return  "PlaceHolder" ; 
    }
    
    public String getCpf() {
        return cpf;
    }
    
    //FALTA VALIDAÇAO PARA CPF NAO SER IGUAL A OUTRO CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    //falta VALIDAÇAO DE DA DATA DE NASCIMENTO ONDE  A PESSOA NAO PODE TER MAIS QUE 115 anos ou idade negativa;
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
