package com.ssh.action;

import com.ssh.service.IExportService;
import com.ssh.utils.ExportUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wu on 2018/12/20.
 */
@Controller("exportAction")
@Scope("prototype")
public class ExportAction {

    @Resource
    private IExportService exportService;

    public String export(){
        List<ExportUtil> exportList = exportService.exportList();
        return "success";
    }
}
