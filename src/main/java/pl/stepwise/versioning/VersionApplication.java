package pl.stepwise.versioning;

import pl.stepwise.versioning.config.VersionConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VersionApplication {

    @Bean
    public InfoContributor versionInfoContributor(VersionConfig versionConfig) {
        return builder -> {
            builder.withDetail("version", versionConfig.getVersion());
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VersionApplication.class, args);
    }
}
