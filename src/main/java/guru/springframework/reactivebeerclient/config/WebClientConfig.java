package guru.springframework.reactivebeerclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by jt on 3/13/21.
 */
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl(WebClientProperties.BASE_URL).build();
    }
}
