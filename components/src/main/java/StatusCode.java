public enum StatusCode implements IStatusCode {
    SYSTEM_ERROR(500, "SY001", "서버와 통신이 원활하지 않습니다.");

    private final int httpStatus;
    private final String code;
    private final String message;

    StatusCode(int httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }

    @Override
    public int getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
