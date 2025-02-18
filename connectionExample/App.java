import factory.DatabaseFactory;
import connection.DatabaseConnection;
import command.DatabaseCommand;

import factory.MySQLFactory;
import factory.PostgreSQLFactory;

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
