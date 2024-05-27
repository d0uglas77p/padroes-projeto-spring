package one.digitalinovation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.model.Cliente;
import one.digitalinovation.service.ClienteService;

/**
 * Este {@link RestController} atua como uma fachada (facade), simplificando o acesso
 * aos recursos da entidade Cliente através de uma API REST.
 * Abstrai a complexidade das integrações (Banco de Dados H2 e API do ViaCEP)
 * fornecendo uma interface coesa e simples.
 *
 * @author Douglas
 */
@RestController
@RequestMapping("clientes") // Mapeia os endpoints deste controlador para começarem com "/clientes"
public class ClienteRestController {

    @Autowired // Injeção de Dependência do ClienteService
    private ClienteService clienteService;

    // Endpoint para buscar todos os clientes
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    // Endpoint para buscar um cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    // Endpoint para inserir um novo cliente
    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    // Endpoint para atualizar um cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    // Endpoint para deletar um cliente por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
