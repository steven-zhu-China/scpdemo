package com.company.cloud.modules.pmgm.controller;

import com.company.cloud.common.R;
import com.company.cloud.modules.pmgm.entity.ProbationEmployeeExclude;
import com.company.cloud.modules.pmgm.services.ProbationEmployeeExcludeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/pmgm/proempexclude")
public class ProbationEmployeeExcludeController {

    @Autowired
    private ProbationEmployeeExcludeService empexcludeService;


    @PostMapping(path = "/save", produces = "application/json;charset=UTF-8")
    public R saveEmpExcludes(@RequestBody List<ProbationEmployeeExclude> empExcludeList) {
        empexcludeService.saveEmployeeExcludeList(empExcludeList);
        return R.ok();
    }

    @DeleteMapping(path = "/delete/{id}")
    public R deleteEmpExcludeById(@PathVariable String id){
        empexcludeService.delete(id);
        return R.ok();
    }

    @GetMapping(path = "/list")
    public R findAllEmpExcludes(){
        return R.ok(empexcludeService.findAll());
    }



}
