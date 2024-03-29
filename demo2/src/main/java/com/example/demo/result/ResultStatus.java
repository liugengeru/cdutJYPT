package com.example.demo.result;

public enum ResultStatus {
    REPEAT(1101,"数据库内容已存在"),
    SUCCESS(1200, "成功"),
    ERROR_REQUEST(1400, "错误的请求"),
    UNAUTHORIZED(1401, "没有授权"),
    FORBIDDEN(1403, "没有权限访问"),
    ERROR_USERNAME(14031, "账号不存在"),
    ERROR_PASSWORD(14032, "密码错误"),
    TOKEN_EXPIRED(14033, "TOKEN过期"),
    NOT_FOND(1404, "页面不存在"),
    SERVER_ERROR(1500, "服务器错误"),
    DATABASE_ERROR(7777,"数据库操作失败"),
    NOT_ENOUGH(8888,"商品数量不足"),
    ERROR(9999, "其他异常");

    private int code;
    private String message;

    ResultStatus(Integer code, String message) {
        this.code = code;
        this.message = message;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
