package cn.com.mdzz.bean;

import java.io.Serializable;

public class AppResult implements Serializable {

    private static final String SUCCESS_MSG = "ok";

    private static final int SUCCESS_CODE = 1;

    private static final int PATAMETER_ERROR_CODE = 100;

    private boolean success;

    private String msg;

    private int code;

    private Object data;

    public static AppResult getSuccessResult(Object data) {
        return new AppResult(true,SUCCESS_MSG,SUCCESS_CODE,data);
    }

    public static AppResult getSuccessResult() {
        return new AppResult(true, SUCCESS_MSG, SUCCESS_CODE, "");
    }

    public static AppResult getErrorResult(String errorMsg,int errorCode) {
        return new AppResult(false, errorMsg, errorCode, "");
    }

    public static AppResult getParamErrorResult(String paramErrorMsg) {
        return new AppResult(false, paramErrorMsg, PATAMETER_ERROR_CODE, "");
    }

    private AppResult(boolean success, String msg, int code, Object data) {
        this.success = success;
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
