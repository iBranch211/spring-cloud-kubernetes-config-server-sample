package io.github.susimsek.springcloudkubernetesconfigserversample;

import io.github.susimsek.springcloudkubernetesconfigserversample.dto.AccountContactInfoDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = AccountContactInfoDTO.class)
@SpringBootApplication
public class SpringCloudKubernetesConfigServerSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudKubernetesConfigServerSampleApplication.class, args);
    }

}
