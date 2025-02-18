package ppr.absfactory;

public class App 
{
    public static void main( String[] args )
    {
        DatabaseFactory factory = new MySQLFactory();
        DatabaseConnection connection = factory.createConnection();
        DatabaseCommand command = factory.createCommand();

        connection.connect();
        command.execute("SELECT * FROM usuarios");

        System.out.println("-------------------");

        factory = new PostgreSQLFactory();
        connection = factory.createConnection();
        command = factory.createCommand();

        connection.connect();
        command.execute("SELECT * FROM clientes");
    }
}
