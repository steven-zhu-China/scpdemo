package com.tsmc.cloud.modules.pmgm.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmailDto {
    private List<String> emailto;
    private List<String> emailcc;
    private List<EmpDto> emplist;
}
