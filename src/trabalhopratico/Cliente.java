/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopratico;

/**
 *
 * @author lgdsc
 */
public class Cliente extends Pessoa{
    private int id;
    private EnderecoCliente endereco;

    public Cliente(int id, String nome, String sobrenome, String rg, String cpf) {
        super(nome, sobrenome, rg, cpf);
        this.id = id;
        endereco = new EnderecoCliente();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnderecoCliente getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCliente endereco) {
        this.endereco = endereco;
    }
    
    


    
    

}
