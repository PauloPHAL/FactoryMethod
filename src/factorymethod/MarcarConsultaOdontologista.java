package factorymethod;

public class MarcarConsultaOdontologista implements MarcarConsulta {

    @Override
    public Medico marcarConsulta() {
        return new Odontologista();
    }
}
