package life.clinic.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import life.clinic.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
