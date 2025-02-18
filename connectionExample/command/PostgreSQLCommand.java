package command;

public class PostgreSQLCommand implements DatabaseCommand {
    
    public void execute(String query) {
        System.out.println("Executando no PostgreSQL: " + query);
    }
}
