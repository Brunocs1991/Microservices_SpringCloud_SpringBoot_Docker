package com.github.brunocs1991.configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("greeting-service")
@Getter
@Setter
@NoArgsConstructor
public class GreetingConfiguration {

    private String greeting;
    private String defaultValue;

}
