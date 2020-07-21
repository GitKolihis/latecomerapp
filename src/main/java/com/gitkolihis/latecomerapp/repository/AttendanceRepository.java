package com.gitkolihis.latecomerapp.repository;

import com.gitkolihis.latecomerapp.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    Attendance findByEmail(String email);
}
