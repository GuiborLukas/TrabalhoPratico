/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopratico;

/**
 *
 * @author lgdsc
 */
public abstract class Pessoa{
    
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;

    public Pessoa(String nome, String sobrenome, String rg, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    

}
