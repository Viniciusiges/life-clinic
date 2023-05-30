package life.clinic.api.domain.consulta.validacoes.agendamento;

import life.clinic.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);

}
