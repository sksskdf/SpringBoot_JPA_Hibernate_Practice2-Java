package com.har.springbootjpa2.dbconnection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@Slf4j
public class conTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void t() throws Exception{
        Connection connection = dataSource.getConnection();
        log.info(String.valueOf(connection.getClass()));
    }
}
