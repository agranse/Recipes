package com.adelsoft.recipie_services.config;

import lombok.extern.slf4j.Slf4j;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@Slf4j
public class JdbiConfiguration {
    @Bean
    public Jdbi jdbi(DataSource ds, List<JdbiPlugin> jdbiPlugins, List<RowMapper<?>> rowMappers) {
        TransactionAwareDataSourceProxy proxy = new TransactionAwareDataSourceProxy(ds);
        Jdbi jdbi = Jdbi.create(proxy);

        // Register all available plugins
        log.info("[I27] Installing plugins... ({} found)", jdbiPlugins.size());
        jdbiPlugins.forEach(jdbi::installPlugin);

        // Register all available rowMappers
        log.info("[I31] Installing rowMappers... ({} found)", rowMappers.size());
        rowMappers.forEach(jdbi::registerRowMapper);
        return jdbi;
    }
}
