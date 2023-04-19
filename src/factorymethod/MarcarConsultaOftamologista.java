package factorymethod;

public class MarcarConsultaOftamologista implements MarcarConsulta {

    @Override
    public Medico marcarConsulta(String nome) {
        return new Oftamologista(nome);
    }

}
