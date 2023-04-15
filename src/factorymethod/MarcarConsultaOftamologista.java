package factorymethod;

public class MarcarConsultaOftamologista implements MarcarConsulta {

    @Override
    public Medico marcarConsulta() {
        return new Oftamologista();
    }

}
