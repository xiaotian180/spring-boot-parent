package cn.xt.app.request;

/**
 * create: xiaotian
 * date: 2018/11/10
 */
public class UserLoginRequest {

    private String userId;
    private String password;
    private String validateCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}
