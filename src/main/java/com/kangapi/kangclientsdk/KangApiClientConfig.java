package com.kangapi.kangclientsdk;


import com.kangapi.kangclientsdk.client.KangApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Nero API 客户端配置类
 * @author csw
 */
@Data
@Configuration
@ConfigurationProperties("kang.client")
@ComponentScan
public class KangApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 此处方法取名无所谓的，不影响任何地方
     *
     * @return
     */
    @Bean
    public KangApiClient getApiClient() {
        return new KangApiClient(accessKey, secretKey);
    }
}
