package one.digitalinovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram adicionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - Open Feign
 *
 * Esta classe principal é anotada com @SpringBootApplication, indicando que
 * é a classe de configuração principal da aplicação Spring Boot. Ela ativa
 * automaticamente a configuração da aplicação Spring Boot e os componentes
 * do Spring. A anotação @EnableFeignClients habilita a funcionalidade do OpenFeign
 * para fazer chamadas de cliente HTTP.
 *
 * @author Douglas
 */

@EnableFeignClients // Habilita a funcionalidade do OpenFeign para fazer chamadas de cliente HTTP
@SpringBootApplication // Indica que esta classe é a classe de configuração principal da aplicação Spring Boot
public class Application {

	public static void main(String[] args) {
		// Método principal que inicia a aplicação Spring Boot
		SpringApplication.run(Application.class, args);
	}

}
