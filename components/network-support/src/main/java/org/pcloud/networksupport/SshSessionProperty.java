package org.pcloud.networksupport;

import lombok.Getter;

@Getter
public class SshSessionProperty {
    /**
     * Session의 이름입니다. 특정 세션을 조회, 종료 등에 쓰입니다. 필수입니다.
     */
    private final String sessionName;

    /**
     * ssh 연결에 대상 이름입니다.
     */
    private final String userName;
    /**
     * host ip address required for Ssh connection.
     */
    private final String host;
    /**
     * Port information required for Ssh connection.
     */
    private final int port;

    /**
     * ssh 연결에 필요한 패스워드입니다.
     */
    private final String password;

    /**
     * ssh 연결에 사용할 임의의 사용자의 연결 포트입니다. 중복을 피해야합니다.
     *
     */
    private final int lPort;
    /**
     * ssh 연결에 사용할 대상의 포트입니다.
     */
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
