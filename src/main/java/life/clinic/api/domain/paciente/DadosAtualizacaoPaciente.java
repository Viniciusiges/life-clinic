package life.clinic.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import life.clinic.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
