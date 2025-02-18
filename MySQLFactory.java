package factory;

class MySQLFactory implements DatabaseFactory {
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }

    public DatabaseCommand createCommand() {
        return new MySQLCommand();
    }
}
