package factory;

class PostgreSQLFactory implements DatabaseFactory {
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection();
    }

    public DatabaseCommand createCommand() {
        return new PostgreSQLCommand();
    }
}
