package hello.core.logdemo;
import hello.core.common.MyLogger;
import org.springframework.stereotype.Service;
@Service
public class LogDemoService {
    private final MyLogger myLogger;

    public LogDemoService(MyLogger myLogger) {
        this.myLogger = myLogger;
    }

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}