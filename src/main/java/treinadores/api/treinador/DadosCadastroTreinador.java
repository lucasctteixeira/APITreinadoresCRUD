package treinadores.api.treinador;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import treinadores.api.endereco.DadosEndereco;

public record DadosCadastroTreinador(
        @NotBlank
        String nome,
        @NotBlank
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String cref,
        @NotNull
        Especialidade especialidade,
        @NotBlank
        DadosEndereco endereco
) {
}
