package factory;

interface DatabaseFactory {
    DatabaseConnection createConnection();
    DatabaseCommand createCommand();
}