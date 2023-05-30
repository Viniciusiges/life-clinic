package life.clinic.api.domain.consulta.validacoes.cancelamento;

import life.clinic.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}
