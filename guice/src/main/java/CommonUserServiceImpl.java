import com.google.inject.Singleton;

@Singleton
public class CommonUserServiceImpl implements UserService {
    @Override
    public void process() {
        System.out.println("commonUser hi");
    }
}
