package com.tsmc.cloud.modules.pmgm.dto;

import lombok.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class EmpDto {
    private String EMPID;
    private String ZFULLNAME;
    private Date HIREDATE;
    private Integer INTERVAL;
    private String USERID;
    private String MASTERID;
    private String MASTERNAME;
    private String EMAIL;
    private String FORMDATAID;
    private String HRNAME;
    private String PHONE;
    private String CODE;


    public String toHtmlString(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        StringBuffer sb = new StringBuffer();
        sb.append("<tr>").append("<td>").append(formatter.format(this.getHIREDATE())).append("</td>")
                .append("<td>").append(this.getEMPID()).append("</td>")
                .append("<td>").append(this.getZFULLNAME()).append("</td>")
                .append("<td>").append(this.getHRNAME()).append("</td>")
                .append("<td>").append(this.getPHONE()).append("</td>").append("</tr>")
        ;
        return sb.toString();
    }
}
