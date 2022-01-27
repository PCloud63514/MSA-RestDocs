package org.pcloud.administrator;

import org.pcloud.administrator.dto.form.GetAdministratorForm;

import java.util.List;

public interface AdministratorViewService extends AdministratorService {
    List<Administrator> getAdministrators(int page, int offset, int size);
    Administrator getAdministrator(GetAdministratorForm form);
}
