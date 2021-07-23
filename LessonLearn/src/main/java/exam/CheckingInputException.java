package exam;

public class CheckingInputException extends Exception {
    //Đây là exception do mình tự định nghĩa
    public CheckingInputException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        //String contains character which cannot be converted into number
        return "Lỗi nhập:  " + super.getMessage();
    }
    
}
