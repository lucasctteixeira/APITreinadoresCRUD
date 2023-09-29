package treinadores.api.treinador;

public record ListagemTreinador(
        Long id,
        String nome,
        String cref,
        String email,
        String telefone,
        Especialidade especialidade
) {

    public ListagemTreinador(Treinador treinador){
        this(treinador.getId(), treinador.getNome(), treinador.getEmail(), treinador.getCref(), treinador.getTelefone(), treinador.getEspecialidade());
    }
}
