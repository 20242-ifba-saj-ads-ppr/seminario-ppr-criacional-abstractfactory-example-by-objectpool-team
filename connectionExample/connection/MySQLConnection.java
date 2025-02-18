package connection;

public class MySQLConnection implements DatabaseConnection {
    public void connect () {
        System.out.println("Conectado ao MySQL!");
    }
}
