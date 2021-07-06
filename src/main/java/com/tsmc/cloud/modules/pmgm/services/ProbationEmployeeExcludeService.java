package com.tsmc.cloud.modules.pmgm.services;

import com.tsmc.cloud.modules.pmgm.entity.ProbationEmployeeExclude;
import com.tsmc.cloud.modules.pmgm.repository.ProbationEmployeeExcludeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ProbationEmployeeExcludeService {

    @Autowired
    private ProbationEmployeeExcludeRepository empexcludeRepository;


    @Transactional
    public void saveEmployeeExcludeList(List<ProbationEmployeeExclude> employeeExcludes){
        empexcludeRepository.saveAll(employeeExcludes);
    }

    @Transactional
    public void delete(String id){
        empexcludeRepository.deleteById(id);
    }

    public List<ProbationEmployeeExclude> findAll(){
        List<ProbationEmployeeExclude> list = new ArrayList<ProbationEmployeeExclude>();
        empexcludeRepository.findAll().forEach( emp -> list.add(emp));
        return list;
    }




}
