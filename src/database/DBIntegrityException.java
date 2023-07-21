package database;

public class DBIntegrityException extends RuntimeException {
    
    private static final long serialVersionUID = 1l;

    public DBIntegrityException(String msg){
        super(msg);
    }

}