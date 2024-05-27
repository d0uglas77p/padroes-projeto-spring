package one.digitalinovation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interface é um componente Spring e gerencia a persistência de entidades
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    // Esta interface estende CrudRepository, fornecendo métodos CRUD básicos para a entidade Endereco
    // O tipo Endereco é a entidade que esta interface gerencia, e String é o tipo da chave primária
}
