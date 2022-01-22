package org.pcloud.networksupport;

public interface ISshConnection {
    void connect();
    void sendAlive();
    boolean isConnect();
    void close();
}
