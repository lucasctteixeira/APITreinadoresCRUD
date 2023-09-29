package treinadores.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import treinadores.api.treinador.*;

import java.util.List;

@RestController
@RequestMapping("treinadores")
public class TreinadorController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTreinador dados){
    repository.save(new Treinador(dados));
    }

    @GetMapping
    public List<ListagemTreinador> listar(){
        return repository.findAll().stream().map(ListagemTreinador::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTreinador dados){
        var treinador = repository.getReferenceById(dados.id());
        treinador.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
        System.out.println("deletado com sucesso " + id);
    }

}
