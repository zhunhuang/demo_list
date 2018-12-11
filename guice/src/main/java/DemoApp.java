import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;


public class DemoApp implements Application {

    @Inject
    @Named("commonUserService")
    private UserService commonUserService;

    @Inject
    @Named("superUserService")
    private UserService superUserService;
    @Inject
    private LogService logService;
    @Inject
    private InfoCheckService infoCheckService;

    @Override
    public void work() {
        commonUserService.process();
        superUserService.process();
        logService.log("finished process");
        infoCheckService.check("nolan","123");
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MyAppModule());
        Application instance = injector.getInstance(Application.class);
        instance.work();
    }
}
