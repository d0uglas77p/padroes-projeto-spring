package one.digitalinovation.service;

import one.digitalinovation.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de cliente. Com isso,
 * se necessário, podemos ter múltiplas implementações dessa mesma interface.
 *
 * Esta interface define os métodos que devem ser implementados por qualquer
 * classe que atue como serviço para operações relacionadas aos clientes.
 * Seguindo o padrão Strategy, ela permite ter várias implementações
 * concretas dessa interface, fornecendo flexibilidade e extensibilidade ao
 * sistema.
 *
 * @author Douglas
 */

public interface ClienteService {

    // Métodos definidos pela interface para operações relacionadas aos clientes

    /**
     * Retorna todos os clientes cadastrados.
     *
     * @return Uma coleção iterável contendo todos os clientes cadastrados.
     */
    Iterable<Cliente> buscarTodos();

    /**
     * Busca um cliente pelo seu ID.
     *
     * @param id O ID do cliente a ser buscado.
     * @return O cliente encontrado, ou null se não for encontrado.
     */
    Cliente buscarPorId(Long id);

    /**
     * Insere um novo cliente no sistema.
     *
     * @param cliente O cliente a ser inserido.
     */
    void inserir(Cliente cliente);

    /**
     * Atualiza as informações de um cliente existente no sistema.
     *
     * @param id      O ID do cliente a ser atualizado.
     * @param cliente O cliente com as novas informações.
     */
    void atualizar(Long id, Cliente cliente);

    /**
     * Deleta um cliente do sistema pelo seu ID.
     *
     * @param id O ID do cliente a ser deletado.
     */
    void deletar(Long id);

}
