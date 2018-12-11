import com.google.inject.Inject;

import java.util.List;

public class InfoCheckServiceImpl implements InfoCheckService {

    @Inject
    private LogService logService;

    private String password;
    private List<String> validUserName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getValidUserName() {
        return validUserName;
    }

    public void setValidUserName(List<String> validUserName) {
        this.validUserName = validUserName;
    }

    public LogService getLogService() {
        return logService;
    }

    public void setLogService(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void check(String userName, String password) {
        if (validUserName.contains(userName) &&
                this.password.equals(password)) {
            logService.log("校验通过");
        } else {
            logService.log("校验失败");
        }
    }
}
