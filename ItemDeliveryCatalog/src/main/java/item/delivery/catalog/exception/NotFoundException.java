package item.delivery.catalog.exception;


public class NotFoundException extends RuntimeException{
    private static final String message = "Does not exist";
    public NotFoundException() {
        super(message);
    }
}
