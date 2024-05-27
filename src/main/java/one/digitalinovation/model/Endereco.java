package one.digitalinovation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Esta classe representa um endereço.
 * Os atributos deste modelo foram gerados automaticamente pelo site jsonschema2pojo.org,
 * usando o JSON de retorno da API do ViaCEP.
 *
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 * @author Douglas
 */
@Entity // Esta anotação indica que esta classe é uma entidade JPA
public class Endereco {

    @Id // Esta anotação indica que o campo 'cep' é a chave primária da entidade
    private String cep; // Campo para armazenar o CEP

    private String logradouro; // Campo para armazenar o logradouro (rua, avenida, etc.)
    private String complemento; // Campo para armazenar informações adicionais do endereço
    private String bairro; // Campo para armazenar o bairro
    private String localidade; // Campo para armazenar a localidade (cidade)
    private String uf; // Campo para armazenar a unidade federativa (estado)
    private String ibge; // Campo para armazenar o código IBGE
    private String gia; // Campo para armazenar o GIA
    private String ddd; // Campo para armazenar o DDD
    private String siafi; // Campo para armazenar o código SIAFI

    // Métodos getters e setters para acessar e modificar os campos da classe

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

}
