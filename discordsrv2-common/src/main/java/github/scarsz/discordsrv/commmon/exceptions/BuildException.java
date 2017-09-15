package github.scarsz.discordsrv.commmon.exceptions;

public class BuildException extends Throwable {

    private final String message;

    public BuildException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
