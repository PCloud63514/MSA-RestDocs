package org.pcloud.exceptionsupport;

public interface IStatusCode {
    int getHttpStatus();
    String getCode();
    String getMessage();
}
