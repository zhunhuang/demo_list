import com.google.common.collect.Lists;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);

        bind(UserService.class).
                annotatedWith(Names.named("commonUserService"))
        .to(CommonUserServiceImpl.class);

        bind(UserService.class).
                annotatedWith(Names.named("superUserService"))
                .to(SuperUserServiceImpl.class);

        bind(Application.class).to(DemoApp.class);
    }

    @Provides
    @Singleton
    InfoCheckService provideInfoCheckService(LogService logService){
        InfoCheckServiceImpl infoCheckService = new InfoCheckServiceImpl();
        infoCheckService.setLogService(logService);
        infoCheckService.setPassword("123");
        infoCheckService.setValidUserName(Lists.newArrayList("nolan","test"));

        return infoCheckService;
    }
}
