import com.google.inject.Singleton;

@Singleton
public class SuperUserServiceImpl implements UserService {
    @Override
    public void process() {
        System.out.println("superUser hi");
    }
}
