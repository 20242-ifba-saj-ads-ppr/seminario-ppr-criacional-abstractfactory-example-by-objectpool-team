package command;

public class MySQLCommand implements DatabaseCommand {
    
    public void execute(String query) {
        System.out.println("Executando no MySQL: " + query);
    }
}
