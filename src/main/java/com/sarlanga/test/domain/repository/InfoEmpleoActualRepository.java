package com.sarlanga.test.domain.repository;

import com.sarlanga.test.domain.entity.InfoEmpleoActualEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoEmpleoActualRepository  extends JpaRepository<InfoEmpleoActualEntity,Long> {
}
