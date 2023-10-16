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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDatabase extends Database {
    private Connection connection;

    public void connect() {
        try {
            // Conexión a MySQL
            String url = "jdbc:mysql://localhost:3306/Danymar";
            String user = "usuario2";
            String password = "contrasenia321";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a MySQL Database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Desconectado de MySQL Database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                // Procesar los resultados de la consulta
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeUpdate(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Query ejecutada exitosamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
