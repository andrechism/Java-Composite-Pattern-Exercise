/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ParteComposta extends ParteDoCorpo{
    List<ParteDoCorpo> partes = new ArrayList<ParteDoCorpo>();
    
    public ParteComposta(String nome) {
        super(nome);
    }

    public void addParte(ParteDoCorpo parte) {
        partes.add(parte);
    }
    
    @Override
    public void exibirPartes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Composto por: ");
        for(ParteDoCorpo p : partes) {
            p.exibirPartes();
        }
        System.out.println("");
    }
}
