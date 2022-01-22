package org.pcloud.networksupport;

import lombok.Getter;

@Getter
public class SshSessionProperty {
    private final String userName;
    /**
     * host ip address required for Ssh connection.
     */
    private final String host;
    /**
     * Port information required for Ssh connection.
     */
    private final int port;

    public SshSessionProperty(String userName, String host, int port) {
        this.userName = userName;
        this.host = host;
        this.port = port;
    }
}
