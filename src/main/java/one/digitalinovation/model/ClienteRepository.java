package one.digitalinovation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interface é um componente Spring e gerencia a persistência de entidades
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    // Esta interface estende CrudRepository, fornecendo métodos CRUD básicos para a entidade Cliente
    // O tipo Cliente é a entidade que esta interface gerencia, e Long é o tipo da chave primária
}
