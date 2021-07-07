package com.company.cloud.modules.pmgm.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ZTAB_APP_PMGM_PROBATIONEMPLOYEEEXCLUDE", schema="ZSCH_ODATA" )
@Data
public class ProbationEmployeeExclude {
    @Id
    private String empid;
    
    private String comment;

}
