package Game_Tank;

public class InvalidMapException extends Exception {
    private String s;
    public InvalidMapException(String s){
        super(s);
        this.s = s;
    }
    public String getS(){
        return s;
    }
}