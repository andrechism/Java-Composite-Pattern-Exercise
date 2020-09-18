/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacomposite;

/**
 *
 * @author andre
 */
public class PartePrimitiva extends ParteDoCorpo{
    
    public PartePrimitiva(String nome) {
        super(nome);
    }

    @Override
    public void exibirPartes() {
        System.out.println("Nome: " + this.getNome());
    }
    
}
