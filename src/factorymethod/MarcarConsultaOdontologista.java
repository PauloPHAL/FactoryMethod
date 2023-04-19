package factorymethod;

public class MarcarConsultaOdontologista implements MarcarConsulta {

    @Override
    public Medico marcarConsulta(String nome) {
        return new Odontologista(nome);
    }
}
