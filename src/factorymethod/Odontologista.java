package factorymethod;

public class Odontologista implements Medico {

    private String nome;

    public Odontologista(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void exibirEspecialidade() {
        System.out.println("Odontologista. ["+this.nome+"]");
    }

}
