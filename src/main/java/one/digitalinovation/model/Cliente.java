package one.digitalinovation.model;

import javax.persistence.*;

@Entity // Esta anotação indica que esta classe é uma entidade JPA
public class Cliente {

    @Id // Esta anotação indica que o campo 'id' é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Esta anotação indica que o valor do 'id' será gerado automaticamente pelo provedor de persistência
    private Long id; // Campo para armazenar o ID do cliente

    private String nome; // Campo para armazenar o nome do cliente

    @ManyToOne // Esta anotação indica que a relação entre Cliente e Endereco é de muitos para um
    private Endereco endereco; // Campo para armazenar o endereço do cliente

    // Métodos getters e setters para acessar e modificar os campos da classe

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
