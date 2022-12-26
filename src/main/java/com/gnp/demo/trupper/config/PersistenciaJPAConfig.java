package com.gnp.demo.trupper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.gnp.demo.trupper.repository")
@EnableTransactionManagement
public class PersistenciaJPAConfig {

}
