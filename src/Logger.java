import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("[" + ldt.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

}
