package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    @SuppressWarnings("UseSpecificCatch")
    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/bdvendas", "teste", "123");

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }

    
     

  
}
