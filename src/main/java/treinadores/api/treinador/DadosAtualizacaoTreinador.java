package treinadores.api.treinador;

import jakarta.validation.constraints.NotNull;
import treinadores.api.endereco.DadosEndereco;

public record DadosAtualizacaoTreinador(

        @NotNull
        Long id,
        String nome,
        String email,
        String telefone,
        Especialidade especialidade,
        DadosEndereco endereco

) {
}
