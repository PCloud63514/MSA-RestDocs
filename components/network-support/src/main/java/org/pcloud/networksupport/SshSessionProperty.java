package org.pcloud.networksupport;

import lombok.Getter;

@Getter
public class SshSessionProperty {
    /**
     * Session의 이름입니다.
     */
    private final String sessionName;

    private final String userName;
    /**
     * host ip address required for Ssh connection.
     */
    private final String host;
    /**
     * Port information required for Ssh connection.
     */
    private final int port;

    private final String password;

    private final int lPort;
    private final int rPort;

    public SshSessionProperty(String sessionName, String userName, String host, int port, int lPort, int rPort) {
        this.sessionName = sessionName;
        this.userName = userName;
        this.host = host;
        this.port = port;
        this.lPort = lPort;
        this.rPort = rPort;
        this.password = null;
    }

    public SshSessionProperty(String sessionName, String userName, String host, int port, String password, int lPort, int rPort) {
        this.sessionName = sessionName;
        this.userName = userName;
        this.host = host;
        this.port = port;
        this.password = password;
        this.lPort = lPort;
        this.rPort = rPort;
    }
}
