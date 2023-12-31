package th.mfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages =  "th.mfu.*")
@EnableAutoConfiguration
@ComponentScan(basePackages = { "th.mfu.*" })
@EntityScan("th.mfu.*")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}


