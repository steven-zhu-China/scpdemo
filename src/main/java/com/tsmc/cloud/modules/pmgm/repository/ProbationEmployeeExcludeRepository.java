package com.tsmc.cloud.modules.pmgm.repository;

import com.tsmc.cloud.modules.pmgm.entity.ProbationEmployeeExclude;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProbationEmployeeExcludeRepository extends CrudRepository<ProbationEmployeeExclude, String> {


}
