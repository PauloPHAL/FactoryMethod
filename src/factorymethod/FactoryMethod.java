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

        MarcarConsulta consulta = new MarcarConsultaPediatra();
        Medico medico = consulta.marcarConsulta();
        medico.exibirEspecialidade();

        consulta = new MarcarConsultaOftamologista();
        medico = consulta.marcarConsulta();
        medico.exibirEspecialidade();

        consulta = new MarcarConsultaOdontologista();
        medico = consulta.marcarConsulta();
        medico.exibirEspecialidade();

    }

}
