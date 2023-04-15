/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author 2021122760216
 */
public class MarcarConsultaPediatra implements MarcarConsulta {

    @Override
    public Medico marcarConsulta() {
        return new Pediatra();
    }

}
