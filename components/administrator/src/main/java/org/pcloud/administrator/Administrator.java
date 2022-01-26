package org.pcloud.administrator;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Administrator {
    private String id;
    private String password;
    private Long companyId;
    private String subScript;
    private LocalDateTime lastLoginDate;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime createAtDate;

    @Builder
    public Administrator(String id, String password, Long companyId, String subScript, LocalDateTime lastLoginDate, LocalDateTime lastUpdateDate, LocalDateTime createAtDate) {
        this.id = id;
        this.password = password;
        this.companyId = companyId;
        this.subScript = subScript;
        this.lastLoginDate = lastLoginDate;
        this.lastUpdateDate = lastUpdateDate;
        this.createAtDate = createAtDate;
    }
}
