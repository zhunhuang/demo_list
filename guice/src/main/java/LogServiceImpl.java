import com.google.inject.Singleton;

@Singleton
public class LogServiceImpl implements LogService{
    @Override
    public void log(String msg) {
        System.out.println("printLog: " + msg);
    }
}
