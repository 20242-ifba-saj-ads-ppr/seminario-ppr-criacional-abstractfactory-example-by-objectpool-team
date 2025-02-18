package factory;

import connection.DatabaseConnection;
import command.DatabaseCommand;

import connection.MySQLConnection;
import command.MySQLCommand;

public class MySQLFactory implements DatabaseFactory {
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }

    public DatabaseCommand createCommand() {
        return new MySQLCommand();
    }
}
