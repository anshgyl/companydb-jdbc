package com.anshgyl.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBConnect {
    private Connection connection = null;
    private String url;
    private String username;
    private String password;

    public DBConnect() {
        try (InputStream input = new FileInputStream("resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.url = prop.getProperty("db.url");
            this.username = prop.getProperty("db.user");
            this.password = prop.getProperty("db.password");

            Class.forName(prop.getProperty("db.driver"));
            connection = DriverManager.getConnection(url, username, password);

        } catch (IOException | ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public ResultSet executeQuery(String sql) {
        Statement st;
        ResultSet rs = null;
        try {
            st = this.connection.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}