/*
    GRUPO:
    Aristídes Debortoli Neto;
    André Plotegher Masioli;
    Paulo Henrique Araujo Loss
    Daniel Fieni
 */
package factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
        MarcarConsulta consulta;
        Medico medico;
        
        consulta = new MarcarConsultaPediatra();
        medico = consulta.marcarConsulta("Pedro");
        medico.exibirEspecialidade();

        consulta = new MarcarConsultaOftamologista();
        medico = consulta.marcarConsulta("Joao");
        medico.exibirEspecialidade();

        consulta = new MarcarConsultaOdontologista();
        medico = consulta.marcarConsulta("Anna");
        medico.exibirEspecialidade();

    }

}
