/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package projetoPOO;
/**
 *
 * @author Lucas
 */
public class Produto {
    private String nome;
    private String tamanho;
    private double peso;
    private Categoria categoria;

    public Produto (){
        this.nome = "nd";
        this.tamanho = "nd";
        this.peso = 0;
        this.categoria = null;
        
    } 

    public Produto(String nome, String tamanho, double peso, Categoria categoria) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.peso = peso;
        this.categoria = categoria;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}

