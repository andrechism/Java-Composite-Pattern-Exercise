package aulacomposite;

/**
 *
 * @author andre
 */
public abstract class ParteDoCorpo {
    private String nome;
    
    public ParteDoCorpo(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public abstract void exibirPartes();
}
