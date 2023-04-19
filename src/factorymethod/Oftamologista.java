package factorymethod;

public class Oftamologista implements Medico {
    private String nome;

    public Oftamologista(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void exibirEspecialidade() {
        System.out.println("Oftamologista. ["+this.nome+"]");
    }
}
