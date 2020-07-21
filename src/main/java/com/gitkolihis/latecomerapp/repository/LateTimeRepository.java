package com.gitkolihis.latecomerapp.repository;

import com.gitkolihis.latecomerapp.entity.LateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LateTimeRepository extends JpaRepository<LateTime, Long> {
}
