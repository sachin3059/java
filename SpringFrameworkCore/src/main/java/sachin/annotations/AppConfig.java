package sachin.annotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "sachin.annotations")
public class AppConfig {
}
