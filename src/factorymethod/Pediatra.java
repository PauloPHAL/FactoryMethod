
package factorymethod;

public class Pediatra implements Medico  {

    private String nome;

    public Pediatra(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public void exibirEspecialidade() {
        System.out.println("Pediatra. ["+this.nome+"]");
    }
}
