package aulacomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        
        String[] dedos = {"Polegar", "Indicador", "Dedo Medio", "Anelar", "Mindinho"};
        String[] ossosDosDedos = {"falange distal", "falange medial", "falange proximal", "metacarpo", "carpo"};
        
        List<PartePrimitiva> listaOssos = new ArrayList<PartePrimitiva>();
        List<ParteComposta> listaDedos = new ArrayList<ParteComposta>();
        
        for(int i = 0; i < ossosDosDedos.length; i++){
            listaOssos.add(new PartePrimitiva(ossosDosDedos[i]));
        }
        
        for(int i = 0; i < dedos.length; i++){
            listaDedos.add(new ParteComposta(dedos[i]));
        }
        
        for(ParteComposta d : listaDedos) {
            for(int i = 0; i < listaOssos.size(); i++){
                d.addParte(listaOssos.get(i));
            }
        }
        
        ParteComposta mao = new ParteComposta("Mão");
        
        for(ParteComposta d : listaDedos){
            mao.addParte(d);
        }
        
        mao.exibirPartes();
        
    }
    
}
