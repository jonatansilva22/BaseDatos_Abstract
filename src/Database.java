/*
Equipo 3:
Herrera Díaz Diego
Martínez Marez Bruce
Pérez González Bruno Martín
Portela Ayala Sebastián
Silva Fragoso Jonatan Eduardo
Zavala Rocha José Ignacio.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public abstract class Database {
    private Connection connection;

    public abstract void connect();
    public abstract void disconnect();
    public abstract void executeQuery(String query);
    public abstract void executeUpdate(String query);
}