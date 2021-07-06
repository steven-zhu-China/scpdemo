package com.tsmc.cloud.modules.pmgm.dto;

import java.util.Comparator;

public class EmpComparetor implements Comparator<EmpDto> {
    @Override
    public int compare(EmpDto e1, EmpDto e2) {
        return e1.getUSERID().compareTo(e2.getUSERID());
    }

}
