package fr.crobert;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class AbstractTest {

    private DataSource dataSource;

    AbstractTest() {
        HikariConfig config = new HikariConfig("hikari.properties");
        dataSource = new HikariDataSource(config);
    }


}
