package org.pcloud.administrator.dto.form;

import lombok.Getter;

@Getter
public class GetAdministratorForm {
    private final String adminId;

    public GetAdministratorForm(String adminId) {
        if (adminId == null || adminId.isEmpty() || 15 < adminId.length())
            throw new IllegalArgumentException("요청한 id는 조회에 적합하지 않습니다.");
        this.adminId = adminId;
    }
}
