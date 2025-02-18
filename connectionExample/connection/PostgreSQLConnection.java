package connection;

public class PostgreSQLConnection implements DatabaseConnection {
    public void connect() {
        System.out.println("Conectado ao PostgreSQL!");
    }
}
