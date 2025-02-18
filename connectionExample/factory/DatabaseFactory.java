package factory;

import connection.DatabaseConnection;
import command.DatabaseCommand;

public interface DatabaseFactory {
    DatabaseConnection createConnection();
    DatabaseCommand createCommand();
}