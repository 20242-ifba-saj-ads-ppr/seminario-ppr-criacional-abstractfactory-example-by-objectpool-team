package factory;

import connection.DatabaseConnection;
import command.DatabaseCommand;
import connection.PostgreSQLConnection;
import command.PostgreSQLCommand;

public class PostgreSQLFactory implements DatabaseFactory {
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection();
    }

    public DatabaseCommand createCommand() {
        return new PostgreSQLCommand();
    }
}
